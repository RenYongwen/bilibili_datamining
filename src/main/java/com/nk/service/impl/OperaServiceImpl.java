package com.nk.service.impl;


import com.nk.dao.OperaDAO;
import com.nk.domain.Opera;
import com.nk.service.OperaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperaServiceImpl implements OperaService {
    @Autowired
    private OperaDAO operaDAO;


    @Override
    public List<Opera> select9() {
        return operaDAO.select9();
    }

    @Override
    public List<Opera> select8() {
        return operaDAO.select8();
    }

    @Override
    public List<Opera> select7() {
        return operaDAO.select7();
    }

    @Override
    public List<Opera> select6() {
        return operaDAO.select6();
    }


}
