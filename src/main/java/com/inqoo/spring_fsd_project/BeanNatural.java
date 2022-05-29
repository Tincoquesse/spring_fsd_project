package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("natural")
public class BeanNatural implements BeanNumberInterface {
    List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void addNumber(int number) {
        list.add(number);
    }
}
