package com.java.advanced.b_streams.arrays;

import java.util.ArrayList;
import java.util.List;

public class convertToUppercase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("--------");
        list.stream().map(String::toLowerCase).forEach(System.out::println);

    }
}
