package com.inqoo.spring_fsd_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(value = MyBean5.class)
@SpringBootApplication
public class SpringFsdProjectApplication implements CommandLineRunner {

    @Autowired
    MyBean5 myBean5;

    public static void main(String[] args) {
        SpringApplication.run(SpringFsdProjectApplication.class, args);
    }

//    @Bean
//     MyBean5 myBean5(MyBean1 myBean1, MyBean2 myBean2, MyBean3 myBean3, MyBean4 myBean4){
//        return new MyBean5(myBean1, myBean2, myBean3, myBean4);
//    }
    @Override
    public void run(String... args) throws Exception {

        myBean5.hello();
    }
}
