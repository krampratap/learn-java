package com.java.advanced.b_static;

public class School {

    private static final School school = new School();

    private School(){

    }

    public static School getInstance(){
        return school;
    }

    static class nestedStaticClassExample{
        void printHello(){
            System.out.println("Hello from Nested static class");
        }
        static void aStaticPrintHello(){
            System.out.println("Static Hello in Nested static class");
        }
    }
}
