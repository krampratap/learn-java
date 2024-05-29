package com.java.advanced.exercises.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list  = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.forEach(System.out::println);

        LinkedList<String> strList = new LinkedList<>();
        strList.add("Tony");
        strList.add("Captain");
        strList.add("Hulk");

        strList.forEach(System.out::println);

        //Using Iterator
        Iterator<String> i = strList.iterator();

        while(i.hasNext()) //CAN BE REPLACED BY ENHANCED FOR
        {
            System.out.println(i.next()+" ");
        }
    }
}
