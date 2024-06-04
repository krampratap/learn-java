package com.java.advanced.lambda;

import java.util.*;

public class lambda5_Comparator {
    /*
        Comparator is a functional interface.
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(19);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
        //In Desc
        list.sort(new MyClass());
        //In Desc Using Lambda
        list.sort((b, c) -> c - b);
        System.out.println(list);

        //Sets
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(2);
        System.out.println("TreeSet naturally stores in sorted order " + set);

        Set<Integer> set2 = new TreeSet<>((a, b) -> b - a); //TreeSet has a constructor with Comparator
        set2.add(5);
        set2.add(1);
        set2.add(2);
        System.out.println("TreeSet after sorting in desc order " + set2);

        //Maps
        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "z");
        m.put(3, "f");
        m.put(1, "y");
        System.out.println("Before manual sorting " + m);

        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(2, "z");
        mm.put(3, "f");
        mm.put(1, "y");
        System.out.println("After manual sorting " + m);
    }
    /* We have created a implementation class which can be avoided with lambda expression*/
    static class MyClass implements Comparator<Integer>{

        @Override
        public int compare(Integer a, Integer b) {
            return b-a;
        }
    }
}
