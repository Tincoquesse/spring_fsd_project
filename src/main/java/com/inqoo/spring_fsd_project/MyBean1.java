package com.inqoo.spring_fsd_project;

import org.springframework.stereotype.Component;

@Component
public class MyBean1 {

    public MyBean1() {
    }

    public void sayHello(){
        System.out.println("My Bean 1");
    }
}
