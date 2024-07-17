package com.java.advanced.multi_threading.b_synchronization;

public class SynchronisationMain {
    public static void main(String[] args) {
        System.out.println("Main has started");
        Stack stack = new Stack(5);

        //Two threads running in parallel.. one is trying to push and other is trying to pop
        new Thread(() -> {
            int counter =0;
            while(++counter<10)
                System.out.println("Pushed : " +stack.push(100));
        },"Pusher").start();

        new Thread(() -> {
            int counter =0;
            while(++counter<10)
                System.out.println("Pop : "+stack.pop());
        }, "Popper").start();

        System.out.println("Main has exited");
    }

}
