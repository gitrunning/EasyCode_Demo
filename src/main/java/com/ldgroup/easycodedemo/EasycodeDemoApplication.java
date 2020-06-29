package com.ldgroup.easycodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.ldgroup.easycodedemo.dao.mapper" })
public class EasycodeDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(EasycodeDemoApplication.class, args);
    }

}
