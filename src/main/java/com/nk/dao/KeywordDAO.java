package com.nk.dao;

import com.nk.domain.Keyword;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeywordDAO {
    public List<Keyword> findKeyword();
}
