package com.java.advanced.multi_threading;

public class MultiThreadingMain {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Thread1 t1 = new Thread1();
        t1.start(); //Start is not called immediately.. it is an asynchronous method and returns immediately
        System.out.println("Main thread closing");
    }
}
