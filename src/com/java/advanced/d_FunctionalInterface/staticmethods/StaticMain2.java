package com.java.advanced.d_FunctionalInterface.staticmethods;

interface A4{
    static void sayHi(){
        System.out.println("Hello");
    }
}
public class StaticMain2 implements A4{
    /* Static methods cannot be overridden
    but here it seems like we are overriding but we are not
    In Earlier example ( StaticMain ) we see that sayHello is not visible in Static main class even though it inherits A3
    So it is like defining a NEW method
    */
    static void sayHello(){
        System.out.println("Hi");
    }
}
