package com.red.service.impl;

import com.red.dao.InformationMapper;
import com.red.entity.Information;
import com.red.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper iMapper;

    @Override
    public List<Information> getAllInformation() {
        return iMapper.selectList(null);
    }
}
