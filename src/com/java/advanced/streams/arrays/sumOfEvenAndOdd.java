package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(33);
        arr.add(43);
        arr.add(53);

        System.out.println(arr.stream().filter(x->x%2==0).collect(Collectors.summingInt(x->x)).toString());
        System.out.println(((Integer) arr.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum()));
        //Why Map to Int.. Filter input is Predicate and output is Stream of type T.. so we have to map to Int
        //filter function definition - Stream<T> filter(Predicate<? super T> predicate)
        //Odd Sum
        System.out.println(arr.stream().filter(x->x%2!=0).mapToInt(x->x).sum());
    }
}
