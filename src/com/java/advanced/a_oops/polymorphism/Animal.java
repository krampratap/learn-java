package com.java.advanced.a_oops.polymorphism;

public class Animal {
    String name;
    String age;

    void makeSound() {
        System.out.println("Some sound"); //If you implement Abstraction.. You don't have to write this unnecessary code for a
    }                                     //General class like Anima which cannot make any sound
}
