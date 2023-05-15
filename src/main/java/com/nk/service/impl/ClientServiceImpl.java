package com.nk.service.impl;

import com.nk.dao.ClientDAO;
import com.nk.domain.Client;
import com.nk.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;
    @Override
    public Client queryByUP(String username,String password){
        return clientDAO.queryByUP(username, password);
    } ;

}
