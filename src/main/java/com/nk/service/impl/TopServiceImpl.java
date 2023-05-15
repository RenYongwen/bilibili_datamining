package com.nk.service.impl;

import com.nk.dao.TopDAO;
import com.nk.domain.Top;
import com.nk.service.TopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopServiceImpl implements TopService {

    @Autowired
    private TopDAO topDAO;

    @Override
    public List<Top> findtopall() {

        return topDAO.findtopall();
    }
    @Override
    public List<Top> findpartall() {

        return topDAO.findpartall();
    }
}
