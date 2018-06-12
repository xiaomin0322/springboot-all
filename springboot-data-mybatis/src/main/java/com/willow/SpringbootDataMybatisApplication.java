package com.willow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.willow.mapper")
public class SpringbootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMybatisApplication.class, args);
    }
}
