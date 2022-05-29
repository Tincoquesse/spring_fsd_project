package com.inqoo.spring_fsd_project;

import org.springframework.stereotype.Component;

@Component
public class ParentBean3 {

    ChildBean childBean;

    public ParentBean3(ChildBean childBean) {
        this.childBean = childBean;
    }
}
