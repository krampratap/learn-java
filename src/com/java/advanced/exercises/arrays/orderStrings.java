package com.java.advanced.exercises.arrays;

import java.util.*;

public class orderStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("Ascending order");
            list.stream().sorted().forEach(System.out::println);
            System.out.println(list.stream().sorted().toList());
            Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending order");
            System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());

    }
}
