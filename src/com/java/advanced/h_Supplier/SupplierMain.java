package com.java.advanced.h_Supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        /* Supplier is a functional interface*/
        Supplier<Integer> supplier = () -> 100; //always returns 100;
        Consumer<Integer> consumer = (x) ->System.out.println(x);

        Predicate<Integer> predicate = x -> x%2==0 ;
        Function<Integer,Integer> function = x-> x*x;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }

    }

}
