package com.java.advanced.Method_reference;
//like static methods, you can refer instance methods also
interface Sayables{
    void say();
}
public class Mr2_Instance {
    public void saySomething(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        Mr2_Instance methodReference = new Mr2_Instance(); // Creating object
        // Referring non-static method using reference
        Sayables sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayables sayable2 = new Mr2_Instance()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }
}
