package com.nk.service.impl;

import com.nk.dao.VideoDAO;
import com.nk.domain.Video;
import com.nk.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoDAO videoDAO;
    @Override
    public List<Video> findAll() {
        return videoDAO.findAll();
    }
}
