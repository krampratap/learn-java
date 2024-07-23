package com.java.advanced.e_predicate;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        /* Predicate has a test method. It can be defined easily using a lambda function
           It can be used to test anything like if salary is greater, or persons name start with S.
         */
        Predicate<Integer> salaryGreaterThanOneLakh = x -> x > 10000; //It holds a condition
        System.out.println(salaryGreaterThanOneLakh.test(10));

        //Predicates are powerful and can be used in Streams()
        Predicate<String> startsWithR = x -> x.startsWith("R");
        System.out.println(startsWithR.test("Ravi"));
        Predicate<String> endsWithm = x -> x.endsWith("m");

        Predicate<String> and = startsWithR.and(endsWithm);
        System.out.println("-----default and method------");
        System.out.println(and.test("Ram"));
        System.out.println(and.test("Tam"));

        System.out.println("-----default or method------");
        Predicate<String> or = startsWithR.or(endsWithm);
        System.out.println(or.test("Tam"));
        System.out.println(or.test("Ram"));

        System.out.println("-----negate default method------");
        System.out.println(startsWithR.negate().test("Ram"));

        System.out.println("-----default equal method----");
        Predicate<String> p = Predicate.isEqual("Hala Madrid") ;
        System.out.println(p.test("Hala Madrid"));
    }
}
