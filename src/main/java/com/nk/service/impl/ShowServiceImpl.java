package com.nk.service.impl;

import com.nk.dao.ShowDAO;
import com.nk.domain.Show;
import com.nk.domain.Showcity;
import com.nk.domain.Showprice;
import com.nk.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowDAO showDAO;
    @Override
    public List<Showcity> findPlaceNum() {
        return showDAO.findPlaceNum();
    }

    @Override
    public List<Show> findShowAll() {
        return showDAO.findShowAll();
    }
    @Override
    public List<Showcity> findAvgPrice(){
        return showDAO.findAvgPrice();
    }
    @Override
    public List<Showcity> findMainCity(){
        return showDAO.findMainCity();
    }
    @Override
    public List<Showprice> findMaxMinPrice() {
        return showDAO.findMaxMinPrice();
    }
}
