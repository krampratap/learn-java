package com.java.advanced.streams.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class insertElementAtFirstPosition {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        arr.add(0,70);
        System.out.println("Addition " + arr);
        //Update at a given index
        arr.set(2,33);
        System.out.println("Update " + arr);

        //remove element at an index
        arr.remove(3);
        System.out.println("Remove "+arr);

        //Search for a given element
        System.out.println(arr.contains(50));

        //Sort an array
        Collections.sort(arr);
        System.out.println("Sorted " + arr);

        //Copy one array to another
        List<Integer> arr2=new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        System.out.println("arr2 "+arr2);
        Collections.copy(arr2,arr);
        System.out.println("Unique elements Copied into one array "+arr2);

        //Shuffle
       // Collections.shuffle(arr);
       // System.out.println("Shuffled"+arr);

        //reverse
        Collections.reverse(arr);
        System.out.println("reversed "+arr);

        List<Integer> sub_list = arr.subList(1,4);
        System.out.println("Sub list "+sub_list);

        //Swap two elements
        Collections.swap(arr,0,4);
        System.out.println("Swaped " + arr);

        //add all
        arr2.addAll(arr);
        System.out.println("added "+arr2);

        //remove all
        arr2.removeAll(arr2);
        System.out.println("removed all     "+arr2);
    }
}
