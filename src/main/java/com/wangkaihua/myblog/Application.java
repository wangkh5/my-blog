package com.wangkaihua.myblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangkaihua
 * @create 2018-08-29 21:06
 **/

@SpringBootApplication
@MapperScan("com.wangkaihua.myblog.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
