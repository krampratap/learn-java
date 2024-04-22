package com.java.advanced.FunctionalInterface.defaultmethods;

interface A1 {
    default void sayHello(){
        System.out.println("Hello A");
    }
}

interface A2 {
    default void sayHello(){
        System.out.println("Hello B");
    }
}

/* This is an interview question
When we use multiple inheritance with the same default method names
It will create an ambiguity in Inherited class which to call ( See the error below )
TO overcome implement(override) the method sayHello
 */

/*public class MultipleInheritance implements A1,A2{
    public static void main(String[] args) {

    }
}*/
