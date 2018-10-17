package com.io.fast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.io.fast.modules.*.dao")
public class FastApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FastApplication.class, args);
    }
}
