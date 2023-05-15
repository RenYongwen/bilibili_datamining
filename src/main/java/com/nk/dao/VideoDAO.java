package com.nk.dao;

import com.nk.domain.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoDAO {
    public List<Video> findAll();
}
