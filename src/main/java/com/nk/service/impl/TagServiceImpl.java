package com.nk.service.impl;

import com.nk.dao.TagDAO;
import com.nk.domain.Tag;
import com.nk.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagDAO tagDAO;
    @Override
    public List<Tag> findAll() {
        return tagDAO.findAll();
    }
}
