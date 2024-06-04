package com.java.advanced.exercises.arrays.conversions;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) {
        String[] playersArray = { "Virat", "Sachin", "Rohit", "Bumrah" };
        System.out.println("Array input: "+ Arrays.toString(playersArray));

        List<String> playersList = Arrays.asList(playersArray);
        System.out.println("Converted elements: " + playersList);

        Integer[] arr = {1,2,3,4,5,6};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.asList(arr));

        int[] arrr = {10,1,2,3,4};
        Arrays.sort(arr);

    }
}
