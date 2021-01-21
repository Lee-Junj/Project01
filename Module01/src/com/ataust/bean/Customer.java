package com.ataust.bean;


import java.util.ArrayList;
import java.util.Date;


public class Customer {
    public Customer() {
    }



    private static final int INITIAL_SIZE = 10;

    public static int getInitialSize() {
        return INITIAL_SIZE;
    }

    public static void main(String[] args) {
        System.out.println("Hello Customer");

        ArrayList list1 = new ArrayList();

        Date date = new Date();

        list1.add(1, 123);


        method123();
        /*

         */
    }

    public static void method123() {

    }

}
