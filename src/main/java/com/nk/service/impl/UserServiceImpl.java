package com.nk.service.impl;

import com.nk.dao.UserDAO;
import com.nk.domain.User;
import com.nk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public List<User> findTop() {
        return userDAO.findTop();
    }

    @Override
    public User findByUserID(Integer id) {
        return userDAO.findByUserID(id);
    }
}
