package com.airisdata.meetups.meetup1;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopingExample {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        //insert into list
        for(int i=0; i<10; i++) {
            intList.add(i);
        }

        List<Integer> addList = new ArrayList<>();

        //Add one to each element
        for(int integer: intList) {
            addList.add(integer = integer + 1);
        }

        System.out.println(intList);
        System.out.println(addList);



    }

}
