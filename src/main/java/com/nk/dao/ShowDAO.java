package com.nk.dao;

import com.nk.domain.Show;
import com.nk.domain.Showcity;
import com.nk.domain.Showprice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShowDAO {
    public List<Showcity> findPlaceNum();//城市举办的活动数
    public List<Show> findShowAll();//按照时间排列的所有信息
    public List<Showcity> findAvgPrice();//城市的平均票价（最低）
    public List<Showcity> findMainCity();//活动数大于2的城市
    public List<Showprice> findMaxMinPrice();

}
