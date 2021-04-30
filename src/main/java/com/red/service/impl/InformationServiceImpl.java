package com.red.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.red.dao.InformationMapper;
import com.red.dao.InformationRecommendMapper;
import com.red.entity.Information;
import com.red.entity.InformationPageInfo;
import com.red.entity.InformationRecommend;
import com.red.service.InformationService;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper iMapper;
    @Autowired
    private InformationRecommendMapper irMapper;

    @Override
    public List<Information> getAllInformation() {
        return iMapper.selectList(null);
    }

    //查询相关页码的相应数量的资讯
    @Override
    public InformationPageInfo getInformationByPage(Integer page,Integer size,Integer type) {
        QueryWrapper<Information> queryWrapper = new QueryWrapper<>();
        if(!type.equals(0)){
            queryWrapper.eq("infomationtype",type);
        }
        Page<Information> informationPage = iMapper.selectPage(
                new Page<>(page, size), queryWrapper
        );
        InformationPageInfo infoPageInfo = new InformationPageInfo();
        infoPageInfo.setCurrent(page);
        infoPageInfo.setInfoList(informationPage.getRecords());
        infoPageInfo.setSize(size);
        infoPageInfo.setTotal(informationPage.getTotal());
        return infoPageInfo;
    }

    @Override
    public List<Information> getInformationByType(Integer type) {
        Map<String, Object> columnMap = new HashMap<String, Object>();
        columnMap.put("infomationtype",type);
        return iMapper.selectByMap(columnMap);
    }

    @Override
    public List<Information> getAllInfoRecommend() {
        List<InformationRecommend> infoRecommend = irMapper.selectList(null);
        List<Integer> list = new ArrayList<Integer>();
        for(InformationRecommend infoR : infoRecommend){
            list.add(infoR.getInfoid());
        }
        return iMapper.selectBatchIds(list);
    }
}
