package com.java.advanced.multi_threading.a_basics;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Thread 2 - "+i);
        }
    }
}
