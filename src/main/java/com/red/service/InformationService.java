package com.red.service;

import com.red.entity.Information;
import com.red.entity.InformationPageInfo;

import java.util.List;

public interface InformationService {
    //获得所有资讯
    public List<Information> getAllInformation();

    //查询当前页码,页数，资讯类型获取相应数量的资讯
    public InformationPageInfo getInformationByPage(Integer page,Integer size,Integer type);

    //根据类型不同获取不同的资讯
    public List<Information> getInformationByType(Integer type);

    //获取所有推荐资讯信息
    public List<Information> getAllInfoRecommend();

}
