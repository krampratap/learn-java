package com.java.advanced.exercises.hashmap;

import java.util.HashMap;

public class add {
    public static void main(String[] args) {
        HashMap<String,Integer> kv = new HashMap<>();

        kv.put("Phones",2);
        kv.put("Laptops",3);
        kv.put("Cars",2);

        System.out.println(kv);

        //Size
        System.out.println(kv.size());

        //Is Empty
        System.out.println(kv.isEmpty());

        //Get specified key
        System.out.println(kv.containsKey("Phones"));

        //Get Specific value
        System.out.println(kv.containsValue(4));

        //Create a set view of the mappings
        System.out.println(kv.entrySet());

        //Get specified key of the map
        System.out.println( kv.get("Phones"));

        //get all the keys in the map
        System.out.println(kv.keySet());

        //Get values
        System.out.println(kv.values());
    }
}
