package com.red.controller;

import com.red.entity.Information;
import com.red.entity.InformationPageInfo;
import com.red.entity.InformationRecommend;
import com.red.service.impl.InformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {

    @Autowired
    private InformationServiceImpl iService;

    //获取所有资讯
    @RequestMapping("/getAllInformation")
    public List<Information> getAllInformation() {
        return iService.getAllInformation();
    }

    @RequestMapping("/getSomeInforByPage/{page}")
    public InformationPageInfo getInSomeformationByPage(@PathVariable("page")Integer page) {
        return iService.getInformationByPage(page);
    }

    //根据资讯类型获取资讯
    @RequestMapping("/getInformationByType/{type}")
    public List<Information> getInformationByType(@PathVariable("type")Integer type){
        return iService.getInformationByType(type);
    }

    //获取推荐资讯的信息
    @RequestMapping("/getInfoRecommend")
    public List<Information> getInfoRecommend() {
//        return irService.getAllInformationRecommend();
        return iService.getAllInfoRecommend();
    }

}
