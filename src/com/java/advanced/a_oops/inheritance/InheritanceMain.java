package com.java.advanced.a_oops.inheritance;

/*
Inheritance allows one class to inherit properties and behaviours from another class (Parent class)
    1. If parent properties or behaviours are private. they are not accessible in the child class.
    2. In general, If you create a class and main method in there in a different package, then you
        won't be able to access the properties until they are private.
        Ex: breed in Oops_Main line 16
        Whereas properties are accessible under the same package main method without public.
        THIS IS CALLED package-private access modifier. By default java assigns this when a field is defined in a class
*/

public class InheritanceMain {
    public static void main(String[] args) {
        Cat c = new Cat();

    }
}
