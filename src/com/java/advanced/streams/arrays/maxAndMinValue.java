package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.List;

public class maxAndMinValue {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        System.out.println(arr.stream().max(Integer::compare));
        System.out.println(arr.stream().max(Integer::compare).orElse(null));

        System.out.println(arr.stream().min(Integer::compare));
        System.out.println(arr.stream().min(Integer::compare).orElse(null));
    }
}
