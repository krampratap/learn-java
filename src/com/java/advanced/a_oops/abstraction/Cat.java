package com.java.advanced.a_oops.abstraction;

public class Cat extends Animal implements Animal2{

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void walk() {
        System.out.println("Cat Walking");
    }

    @Override
    public void makeNoise() {
        System.out.println("Making noise");
    }
}
