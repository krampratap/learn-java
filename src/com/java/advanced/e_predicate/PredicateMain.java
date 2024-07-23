package com.java.advanced.e_predicate;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        /* Predicate has a test method. It can be defined easily using a lambda function
           It can be used to test anything like if salary is greater, or persons name start with S.
         */
        Predicate<Integer> salaryGreaterThanOneLac = x -> x > 10000; //It holds a condition
        System.out.println(salaryGreaterThanOneLac.test(10));

        //Predicates are powerful and can be used in Streams()
        Predicate<String> startsWithR = x -> x.startsWith("R");
        System.out.println(startsWithR.test("Ravi"));
        Predicate<String> endsWithM = x -> x.endsWith("m");

        System.out.println("-----default and method------");
        Predicate<String> startsAndEnds = startsWithR.and(endsWithM);
        System.out.println(startsAndEnds.test("Ram"));
        System.out.println(startsAndEnds.test("Tam"));

        System.out.println("-----default or method------");
        Predicate<String> startsOrEnds = startsWithR.or(endsWithM);
        System.out.println(startsOrEnds.test("Tam"));
        System.out.println(startsOrEnds.test("Ram"));

        System.out.println("-----negate default method------");
        System.out.println(startsWithR.negate().test("Ram"));

        System.out.println("-----default equal method----");
        Predicate<String> p = Predicate.isEqual("Hala Madrid") ;
        System.out.println(p.test("Hala Madrid"));
    }
}
