package com.red;

import com.red.entity.InformationPageInfo;
import com.red.service.impl.InformationServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InformationTest {
    @Autowired
    private InformationServiceImpl iService;

    @Test
    public void getInformationByPageTest() {
        InformationPageInfo infoPageInfo = iService.getInformationByPage(2,6,0);
        System.out.println(infoPageInfo.toString());
    }

}
