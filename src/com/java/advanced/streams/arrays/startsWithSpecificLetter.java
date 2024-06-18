package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.List;

public class startsWithSpecificLetter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.stream().filter(x->x.startsWith("T")).forEach(System.out::println);

    }
}
