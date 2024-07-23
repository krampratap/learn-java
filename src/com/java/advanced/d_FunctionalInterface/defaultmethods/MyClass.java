package com.java.advanced.d_FunctionalInterface.defaultmethods;

interface A {
    /*void sayHello()  - Gives error because we have definition - So convert to default
    default methods is nothing but method with definition
    {
        System.out.println("Hello");
    }*/

    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements A{

}
public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello(); // we are able to directly use the Interface methods
    }
}
