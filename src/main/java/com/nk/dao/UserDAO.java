package com.nk.dao;

import com.nk.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    public List<User> findAll();
    public List<User> findTop();
    public User findByUserID(Integer id);
}
