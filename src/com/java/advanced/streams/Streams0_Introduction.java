package com.java.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams0_Introduction {
    public static void main(String[] args) {
        //List to Stream
        List<String> list = Arrays.asList("Apple","Banana","Cat");
        Stream<String> listStream = list.stream();

        //Array to Stream
        String[] strArray = {"Car","Train"};
        Stream<String> strListStream = Arrays.stream(strArray);

        int[] intArray = {1,2,3};
        //Stream<Integer> integerStream = Arrays.stream(intArray); //Error as stream returns IntStream
        IntStream integerStream = Arrays.stream(intArray); //IntStream is a primitive int specialization of Stream

        Stream<Integer> intStream = Stream.of(1,2,3);

        Stream.iterate(0,n->n+1).limit(100);
        //Iterate : seed is starting point, second argument is Unary Operator i.e Function i.e lambda function

        Stream.generate(() -> "hello").limit(5);
        //Generate : Takes a Supplier as Input
    }

}
