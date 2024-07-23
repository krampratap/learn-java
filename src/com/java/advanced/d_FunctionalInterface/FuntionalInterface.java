package com.java.advanced.d_FunctionalInterface;

@FunctionalInterface
public interface FuntionalInterface {
    public void sayHello(); // One abstract method
    //Any number of default or static methods
    default void sayBye(){
    }
    static void sayOk(){};
}
