package com.ruanku.farm.config;

import com.ruanku.farm.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;



@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//          registry.addViewController("/farm/login").setViewName("login");
//    }


    /*
     * 国际化配置
     * */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
