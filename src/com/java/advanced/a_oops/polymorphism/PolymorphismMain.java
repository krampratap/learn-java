package com.java.advanced.a_oops.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Animal dog = new Dog(); //Object is Dog and Reference is Animal
                                //You can create a child class( sub class ) as an instance of Parent class

        dog.makeSound();
    }
}
