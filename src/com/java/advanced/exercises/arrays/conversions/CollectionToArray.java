package com.java.advanced.exercises.arrays.conversions;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Geeks ");
        list.add("for ");
        list.add("Geeks ");
        list.add("is ");
        list.add("the ");
        list.add("Best.");

        // Converting list to an array
        String[] str = list.toArray(new String[0]);

        // Iterating over elements of array
        for (int i = 0; i < str.length; i++) {
            String data = str[i];

            // Printing elements of an array
            System.out.print(data);
        }
    }
}
