package com.java.advanced.g_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        //Consumer is also functional interface
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("test");

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };

        listConsumer.accept(Arrays.asList(1,2,3,4));
    }
}
