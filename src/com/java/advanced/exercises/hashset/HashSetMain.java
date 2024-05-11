package com.java.advanced.exercises.hashset;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> hash= new HashSet<>();
        hash.add("One");
        hash.add("Two");
        hash.add("Two");
        hash.add("Three");
        System.out.println(hash);

        //Iterator
        for (String s : hash) {
            System.out.println(s);
        }

        System.out.println("Size "+hash.size());

        //Empty or not
        System.out.println(hash.isEmpty());

        //Convert HashSet to List
        String[] lis = new String[hash.size()];
        hash.toArray(lis);

        System.out.println(lis); //Not Printing to convert to List using as List
        System.out.println("Arrays "+Arrays.asList(lis));

        //Convert Hashset to TreeSet
        Set<String> set = new HashSet<>(hash);
        System.out.println("Set " + set);

        //remove all elements
        hash.clear();
        System.out.println("removed all elements S" + hash);
    }
}
