package com.inqoo.spring_fsd_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFsdProjectApplication implements CommandLineRunner {

    @Autowired
    ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringFsdProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        BeanNumberInterface numberInterface = applicationContext.getBean(BeanNumberInterface.class);
        numberInterface.addNumber(1);
        numberInterface.addNumber(2);
        numberInterface.addNumber(3);
        numberInterface.addNumber(4);
        numberInterface.addNumber(5);
        numberInterface.addNumber(6);
        numberInterface.getList().forEach(number -> System.out.println(number));

    }
}
