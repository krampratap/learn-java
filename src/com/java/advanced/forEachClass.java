package com.java.advanced;

import java.util.ArrayList;
import java.util.List;

public class forEachClass {
    public static void main(String[] args) {
        List<String> games = new ArrayList<String>();
        games.add("Cricket");
        games.add("Hockey");
        games.add("Tennis");
        games.add("Chess");

        games.forEach(g-> System.out.println(g));

        System.out.println("------------Iterating by passing method reference---------------");
        games.forEach(System.out::println);

        //Along with forEach() method, Java provides one more method forEachOrdered().
        // It is used to iterate elements in the order specified by the stream.

        games.stream().forEachOrdered(System.out::print);

    }
}
