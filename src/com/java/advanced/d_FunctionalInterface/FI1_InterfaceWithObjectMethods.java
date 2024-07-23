package com.java.advanced.d_FunctionalInterface;

interface sayable
{
    void say(String msg);
    //Any number of object classes can be instantiated
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FI1_InterfaceWithObjectMethods implements sayable{
    @Override
    public void say(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FI1_InterfaceWithObjectMethods FI = new FI1_InterfaceWithObjectMethods();
        FI.say("Functional Interfaces are cool");
        System.out.println(FI.toString());
    }
}
