package com.inqoo.spring_fsd_project;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component
@Profile("sumList")
public class BeanSumEverySecondNumber implements BeanNumberInterface {

    List<Integer> sumList = new ArrayList<>();

    public void addNumber(int number) {
        sumList.add(number);
    }

    public List<Integer> getList() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < sumList.size(); i += 2) {
            int temp = sumList.get(i) + sumList.get(i + 1);
            list.add(temp);
        }
        return list;
    }


}
