package com.red;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.red.dao")
@SpringBootApplication
public class FirstProjectApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApiApplication.class, args);
    }

}
