package com.nk.service;


import com.nk.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public List<User> findTop();
    public User findByUserID(Integer id);
}
