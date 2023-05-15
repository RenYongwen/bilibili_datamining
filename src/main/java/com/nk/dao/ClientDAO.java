package com.nk.dao;

import com.nk.domain.Client;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientDAO {
    public Client queryByUP(String username,String password);
}
