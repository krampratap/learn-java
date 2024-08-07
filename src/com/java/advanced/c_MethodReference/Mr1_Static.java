package com.java.advanced.c_MethodReference;
//we have defined a functional interface and referring a static method saySomething() to it's functional method say().
interface Sayable{
    void say();
}

public class Mr1_Static {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = Mr1_Static::saySomething;
        // Calling interface method
        sayable.say();
    }
}
