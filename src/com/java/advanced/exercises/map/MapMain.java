package com.java.advanced.exercises.map;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        System.out.println("Non Generic implementation");
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

        System.out.println("Generic implementation");
        Map<Integer,String> genericMap = new HashMap<>();
        genericMap.put(102,"Hari");
        genericMap.put(101,"Krish");
        genericMap.put(103,"Theem");

        System.out.println("    Traverse in any order");
        for (Map.Entry<Integer, String> entry : genericMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("    Key: " + key + ", Value: " + value);
        }

        System.out.println("Sorted By Key Traversal");
        genericMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("reverse Sorted By Key Traversal");
        genericMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("Sorted by Value Traversal");
        genericMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("Sorted by Value reverse Traversal");
        genericMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
