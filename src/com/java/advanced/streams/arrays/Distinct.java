package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
   public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>();
       arr.add(10);
       arr.add(10);
       arr.add(60);
       arr.add(40);
       arr.add(50);
       arr.add(60);

       arr.stream().distinct().forEach(System.out::println);
       System.out.println(arr.stream().distinct().toList());
    }
}
