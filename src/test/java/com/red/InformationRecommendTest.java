package com.red;

import com.red.entity.Information;
import com.red.entity.InformationRecommend;
import com.red.service.impl.InformationServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class InformationRecommendTest {
    @Autowired
    private InformationServiceImpl iService;

    //获取推荐资讯测试
    @Test
    public void getAllInfoRecommend() {
        List<Information> list = iService.getAllInfoRecommend();
        for(Information info : list) {
            System.out.println(info.toString());
        }
    }

    //根据id获取资讯信息测试
    @Test
    public void getInfoByIdTest() {
        System.out.println(iService.getInfoById(71).toString());
    }


}
