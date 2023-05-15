package com.nk.dao;

import com.nk.domain.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagDAO {
    public List<Tag> findAll();
}
