package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanParent {

    @Bean
    BeanChild beanChild1(){
        BeanChild beanChild1 = new BeanChild("child 1");
        return beanChild1;
    }

    @Bean
    BeanChild beanChild2() {
        BeanChild beanChild2 = new BeanChild("child 2");
        return beanChild2;
    }


}
