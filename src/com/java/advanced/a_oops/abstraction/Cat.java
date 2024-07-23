package com.java.advanced.a_oops.abstraction;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void walk() {
        System.out.println("Walking");
    }
}
