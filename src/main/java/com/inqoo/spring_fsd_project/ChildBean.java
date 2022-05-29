package com.inqoo.spring_fsd_project;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class ChildBean {

    @PostConstruct
    public void postConstruct(){
        System.out.println("Child Bean created ! ======>>>>");
    }
}
