package com.java.advanced;

import java.util.StringJoiner;

public class StringJoiners {
    public static void main(String[] args) {
        StringJoiner joinStrings = new StringJoiner(",");
        joinStrings.add("Tony");
        joinStrings.add("Stark");
        joinStrings.add("Chris");
        joinStrings.add("Evans");

        System.out.println(joinStrings);

        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        joinNames.add("Rahul");
        joinNames.add("Raju");

        System.out.println("Prefix and Suffix : "+joinNames);

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println("Merged : "+merge);
    }
}
