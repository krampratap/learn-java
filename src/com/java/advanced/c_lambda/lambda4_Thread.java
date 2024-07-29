package com.java.advanced.c_lambda;

public class lambda4_Thread {
    private static void main(String[] args) {
        /*
            runnable is used to run a thread.
            runnable is a functional interface with one method run. so, lambda expression is the implementation of run method.
         */
        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
            }
        };

        Thread t2=new Thread(r2);
        t2.start();

        Thread t3 = new Thread(()->{
            System.out.println("Thread2 is running...");
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
            }
        });

        t3.start();

        Runnable r = new Runnable() {
            @Override
                 public   void run(){
                System.out.println("T");
            }
        };

        Thread t123 = new Thread(r);
        t123.start();
        Thread t34 = new Thread(() -> System.out.println("t"));
        t34.start();
    }
}
