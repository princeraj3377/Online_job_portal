package com.jobportal.service;

import com.jobportal.dao.UserDAO;
import com.jobportal.model.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public void registerUser(User user) {
        userDAO.save(user);
    }

    public User getUserByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
