package com.java.advanced.multi_threading.a_basics;

/*Create a Thread using Runnable interface
Implementing a thread using the method of Runnable interface is more preferred and advantageous as Java does not
have support for multiple inheritances of classes. start() method is used for creating
a separate call stack for the thread execution.
Once the call stack is created, JVM calls the run() method for executing the thread in that call stack.
 */

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Thread 2 - "+i);
        }
    }
}
