package com.java.advanced.multi_threading;

public class MultiThreadingMain {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Thread1 firstThread = new Thread1("First Thread");
        //firstThread.setDaemon(true);
        firstThread.start(); //Start is not called immediately.. it is an asynchronous method and returns immediately

        Thread secondThread = new Thread(new Thread2(),"Second Thread");
        secondThread.start();

        System.out.println("Main thread closing");
    }
}
