package com.java.advanced.multi_threading.c_producerConsumerPattern;

import java.util.LinkedList;
import java.util.Queue;

//Suppose there is a storage using queue
//If we many threads accessing the queue.. we can group them into two sections..
// one queue is trying to get the data from queue another is trying to insert into the queue
//We can push if the stack is not full and pull if stack is not empty
public class BlockingQueue {
    private Queue<Integer> queue;
    private int capacity;

    public BlockingQueue(int capacity){
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean push(int i){
        synchronized (queue){
            while(queue.size()==capacity)  //waits until queue size is less than capacity
            {
                try{
                    queue.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            queue.add(i);
            queue.notifyAll();
            return true;
        }
    }

    public int pop(){
            synchronized (queue){
                while(queue.size()==0){     //waits until queue size is greater than one
                    try{
                        queue.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                int element = queue.poll();
                return element;
            }
    }
}
