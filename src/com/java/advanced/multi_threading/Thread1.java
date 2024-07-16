package com.java.advanced.multi_threading;

public class Thread1 extends Thread{

    public Thread1(String threadName){
        super(threadName);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Thread 1 - "+i+"thread name can be accessed by : "+Thread.currentThread().getName());
        }
    }
}
