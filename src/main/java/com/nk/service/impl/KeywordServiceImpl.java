package com.nk.service.impl;

import com.nk.dao.KeywordDAO;
import com.nk.domain.Keyword;
import com.nk.service.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordServiceImpl implements KeywordService {
    @Autowired
    private KeywordDAO keywordDAO;

    @Override
    public List<Keyword> findKeyword(){
        return keywordDAO.findKeyword();
    }
}
