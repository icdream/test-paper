package com.cdream.testpaper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cdream.testpaper.mapper")
public class TestpaperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestpaperApplication.class, args);
    }

}

