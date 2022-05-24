package com.yukon_wm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yukon_wm.dao")
public class YukonWmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YukonWmApplication.class, args);
    }

}
