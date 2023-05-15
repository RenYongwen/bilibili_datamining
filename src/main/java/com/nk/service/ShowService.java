package com.nk.service;

import com.nk.domain.Show;
import com.nk.domain.Showcity;
import com.nk.domain.Showprice;

import java.util.List;

public interface ShowService {
    public List<Showcity> findPlaceNum();
    public List<Show> findShowAll();
    public List<Showcity> findAvgPrice();
    public List<Showcity> findMainCity();
    public List<Showprice> findMaxMinPrice();
}
