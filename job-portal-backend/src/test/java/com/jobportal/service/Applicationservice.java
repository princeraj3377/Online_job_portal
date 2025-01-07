package com.jobportal.service;

import com.jobportal.dao.ApplicationDAO;
import com.jobportal.model.Application;

import java.util.List;

public class ApplicationService {
    private ApplicationDAO applicationDAO;

    public ApplicationService() {
        this.applicationDAO = new ApplicationDAO();
    }

    public void applyForJob(Application application) {
        applicationDAO.save(application);
    }

    public List<Application> getApplicationsForJob(int jobId) {
        return applicationDAO.findByJobId(jobId);
    }
}
