package com.java.advanced.d_FunctionalInterface.staticmethods;

interface A3{
    /*
        static void sayHello();  Will give error because static method should have definition or make it abstract
     */
    static void sayHello(){
        System.out.println("Hello");
    }

    default void sayBye(){
        System.out.println("Bye");
    }
}
public class StaticMain implements A3{
    public static void main(String[] args) {
        StaticMain obj = new StaticMain();
        //obj.sayHello(); //Error
        //StaticMain.sayHello(); //Error
        A3.sayHello(); //Only one way to call STATIC methods inside interface
        obj.sayBye(); //Default methods we can call
    }
}
