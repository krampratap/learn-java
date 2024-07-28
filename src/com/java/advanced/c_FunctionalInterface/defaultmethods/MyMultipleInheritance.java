package com.java.advanced.c_FunctionalInterface.defaultmethods;

interface A1 {
     default void sayHello() { System.out.println("Hello A"); }
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
        MultipleInheritance m = new MultipleInheritance();
        m.sayHello(); //Which sayHello to run as there is multiple inheritance
    }
}*/
//In the above case we can override in class where we inherit


class MyClasss implements A1,A2{
    public static void main(String[] args) {
        MyClasss m = new MyClasss();
        m.sayHello();
    }
    @Override
    public void sayHello(){ //public is imp
        A1.super.sayHello();
        A2.super.sayHello();
        System.out.println("My Implementation");
    }
}

