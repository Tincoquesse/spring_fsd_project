package com.inqoo.spring_fsd_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.CommandLinePropertySource;

@SpringBootApplication
public class SpringFsdProjectApplication implements CommandLineRunner {

    @Autowired
    ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringFsdProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BeanChild bean1 = (BeanChild) applicationContext.getBean("beanChild1");
        bean1.sayHello();
    }
}
