package com.jobportal.dao;

import com.jobportal.model.Job;

import java.util.ArrayList;
import java.util.List;

public class JobDAO {
    private static List<Job> jobs = new ArrayList<>();

    public void save(Job job) {
        jobs.add(job);
    }

    public List<Job> findAll() {
        return new ArrayList<>(jobs);
    }
}
