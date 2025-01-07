package com.jobportal.controller;

import com.jobportal.model.Job;
import com.jobportal.service.JobService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class JobServlet extends HttpServlet {
    private JobService jobService;

    @Override
    public void init() {
        jobService = new JobService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("view".equals(action)) {
            List<Job> jobs = jobService.getAllJobs();
            request.setAttribute("jobs", jobs);
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewJobs.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String company = request.getParameter("company");

        Job job = new Job(title, description, company);
        jobService.addJob(job);
        response.sendRedirect("jobs?action=view");
    }
}