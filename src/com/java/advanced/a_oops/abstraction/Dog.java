package com.java.advanced.a_oops.abstraction;

/*
    When you extend from an abstract class like Animal.. You will get error to make the current class as abstract
    or implement the abstract methods.
 */
public class Dog extends  Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void walk() {
        System.out.println("Walking");
    }
}
