package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test_package.MyBean;

@Configuration
public class TestConfig {

    @Bean
    MyBean myBean(){
        return new MyBean();
    }
    @Bean
    MyBean2 myBean2(){
        return new MyBean2();
    }
}
