package com.nk.dao;

import com.nk.domain.Top;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopDAO {
    public List<Top> findpartall();
    public List<Top> findtopall();

}
