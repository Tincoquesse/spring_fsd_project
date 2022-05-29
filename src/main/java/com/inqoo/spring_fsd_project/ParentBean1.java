package com.inqoo.spring_fsd_project;

import org.springframework.stereotype.Component;

@Component
public class ParentBean1 {

    ChildBean childBean;

    public ParentBean1(ChildBean childBean) {
        this.childBean = childBean;
    }
}
