package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.List;

public class secondSmallestAndLargest {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        System.out.println("Second Highest");
        System.out.println(arr.stream().sorted().toList().get(arr.size()-2));
        System.out.println(arr.stream().distinct().sorted((a,b)-> Integer.compare(b,a)).skip(1).findFirst().orElse(null));

        System.out.println("Second Lowest");
        System.out.println(arr.stream().distinct().sorted().skip(1).findFirst().orElse(null));
    }
}
