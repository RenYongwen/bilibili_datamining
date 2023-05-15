package com.nk.service;

import com.nk.domain.Client;

public interface ClientService {
    public Client queryByUP(String username, String password);

}
