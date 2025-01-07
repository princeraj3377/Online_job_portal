package com.jobportal.dao;

import com.jobportal.model.Application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDAO {
    private static List<Application> applications = new ArrayList<>();

    public void save(Application application) {
        applications.add(application);
    }

    public List<Application> findByJobId(int jobId) {
        List<Application> result = new ArrayList<>();
        for (Application application : applications) {
            if (application.getJobId() == jobId) {
                result.add(application);
            }
        }
        return result;
    }
}
