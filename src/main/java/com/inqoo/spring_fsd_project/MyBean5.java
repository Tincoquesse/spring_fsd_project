package com.inqoo.spring_fsd_project;

import org.springframework.stereotype.Component;

//@Component
public class MyBean5 {

    private final MyBean1 myBean1;
    private final MyBean2 myBean2;
    private final MyBean3 myBean3;
    private final MyBean4 myBean4;


    public MyBean5(MyBean1 myBean1, MyBean2 myBean2, MyBean3 myBean3, MyBean4 myBean4) {
        this.myBean1 = myBean1;
        this.myBean2 = myBean2;
        this.myBean3 = myBean3;
        this.myBean4 = myBean4;
    }

    public void hello(){
        myBean1.sayHello();
        myBean2.sayHello();
        myBean3.sayHello();
        myBean4.sayHello();
    }
}
