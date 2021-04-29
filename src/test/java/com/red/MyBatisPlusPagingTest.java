package com.red;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.red.dao.InformationMapper;
import com.red.entity.Information;
import com.red.service.impl.InformationServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusPagingTest {

    @Autowired
    private InformationServiceImpl iService;
    @Autowired
    private InformationMapper iMapper;
    //分页测试
    @Test
    public void getAllInfoRecommend() {
        Page<Information> infoPage = iMapper.selectPage(new Page<>(2,2),
                null);
        List<Information> list = infoPage.getRecords();
        for(Information info : list) {
            System.out.println(info.toString());
        }
    }
}
