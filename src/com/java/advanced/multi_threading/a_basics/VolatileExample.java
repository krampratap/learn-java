package com.java.advanced.multi_threading.a_basics;

/*
Without the volatile keyword, there's a chance that the worker thread may not see the updated value of running,
leading to an infinite loop.
 */
public class VolatileExample {
    private volatile boolean running = true;

    public void start() {
        Thread thread = new Thread(() -> {
            while (running) {
                // Perform some work
                System.out.println("Thread is running");
            }
            System.out.println("Thread has stopped");
        });

        thread.start();
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.start();

        Thread.sleep(1000); // Let the thread run for a while
        volatileExample.stop(); // Request the thread to stop
    }
}