package com.java.advanced.lambda;

import java.util.ArrayList;
import java.util.List;

public class lambda3_forEach {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("ankit");
        l.add("mayank");
        l.add("irfan");
        l.add("jai");

        l.forEach(n -> System.out.println(n)); //Better way is to implement using Method Reference
        l.forEach(System.out::println); //Same as above
    }
}
