package com.jobportal.model;

public class Job {
    private String title;
    private String description;
    private String company;

    public Job(String title, String description, String company) {
        this.title = title;
        this.description = description;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCompany() {
        return company;
    }
}
