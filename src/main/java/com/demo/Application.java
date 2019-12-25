package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 设置 SpringBoot 启动类
 */
@SpringBootApplication
//扫描mapper接口
@MapperScan("com.demo.mapper")
public class Application {
    public static void main(String[] args) {
        //启动
        SpringApplication.run(Application.class, args);
    }
}
