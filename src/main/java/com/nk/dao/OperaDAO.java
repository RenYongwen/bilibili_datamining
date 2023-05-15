package com.nk.dao;

import com.nk.domain.Opera;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperaDAO {
    public List<Opera> select9();
    public List<Opera> select8();
    public List<Opera> select7();
    public List<Opera> select6();
}
