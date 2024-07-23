package com.java.advanced.c_FunctionalInterface.staticmethods;
/*
Usually we define main in a class
What if we define main in an interface

In java 8 as we can define static methods, so we can define main
 */
public interface StaticMain3 {
     static void main(String[] args) {
        System.out.println("Hi from interface");
    }
}
