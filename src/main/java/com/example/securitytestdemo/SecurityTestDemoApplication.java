package com.example.securitytestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.securitytestdemo.mapper")
public class SecurityTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityTestDemoApplication.class, args);
    }

}
