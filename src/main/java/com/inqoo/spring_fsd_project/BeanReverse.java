package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Profile("reverse")
public class BeanReverse implements BeanNumberInterface {

    private List<Integer> listReverse = new ArrayList<>();

    public void addNumber(int number) {
        listReverse.add(number);
    }

    public List<Integer> getList() {
        Collections.reverse(listReverse);
        return listReverse;
    }
}
