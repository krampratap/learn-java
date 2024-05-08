package com.java.advanced.exercises.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map map  = new HashMap();
        map.put(1,"Ashok");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        System.out.println(map);

        Set set = map.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
