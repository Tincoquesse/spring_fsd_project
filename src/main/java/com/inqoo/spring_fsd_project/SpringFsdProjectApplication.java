package com.inqoo.spring_fsd_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"test_package", "com.inqoo.spring_fsd_project"})

public class SpringFsdProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFsdProjectApplication.class, args);
    }

}
