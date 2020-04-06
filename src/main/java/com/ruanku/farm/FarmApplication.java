package com.ruanku.farm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.ruanku.farm.mapper")
@SpringBootApplication
//@EnableCaching
public class FarmApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FarmApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FarmApplication.class);
    }

}
