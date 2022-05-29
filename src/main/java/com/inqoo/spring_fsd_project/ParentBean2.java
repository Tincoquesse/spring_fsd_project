package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ParentBean2 {

    ChildBean childBean;

    public ParentBean2(ChildBean childBean) {
        this.childBean = childBean;
    }
}

