package com.java.advanced.b_streams.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class averageInt {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(arr.stream().collect(Collectors.averagingInt(x->x)));
        System.out.println(arr.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0));
    }
}
