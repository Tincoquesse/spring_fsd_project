package com.inqoo.spring_fsd_project;


public class BeanChild {

    String name = "";

    public BeanChild(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }
}
