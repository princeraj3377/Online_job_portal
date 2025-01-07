package com.jobportal.service;

import com.jobportal.dao.JobDAO;
import com.jobportal.model.Job;

import java.util.List;

public class JobService {
    private JobDAO jobDAO;

    public JobService() {
        this.jobDAO = new JobDAO();
    }

    public void addJob(Job job) {
        jobDAO.save(job);
    }

    public List<Job> getAllJobs() {
        return jobDAO.findAll();
    }
}
