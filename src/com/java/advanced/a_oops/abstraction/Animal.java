package com.java.advanced.a_oops.abstraction;
/*
Animal is a generalised class. So when asked what sound does animal make (makeSound).. we cannot say..
we can only say based on which animal it is. So we cannot define makeSound method in Animal class, So MAKE IT ABSTRACT.
Once you make the method abstract.. it will give an error that make the class also abstract.. SO MAKE CLASS ABSTRACT.
Abstract class can have regular methods also : Concrete methods
You cannot have public "final" abstract class Animal { as abstract classes are meant to be inherited
*/
public abstract class Animal {
    public Animal(){
        System.out.println("Animal created");
    }

    public abstract void makeSound();
    abstract void walk();
    public void sleep(){
        System.out.println("Zzzz..");
    }
}

interface test{
    String s = "te";

}
