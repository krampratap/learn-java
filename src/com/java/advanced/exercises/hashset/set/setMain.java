package com.java.advanced.exercises.hashset.set;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setMain {
    public static void main(String[] args) {
        System.out.println("Set has unique elements only");
        Set<String> setHash = new HashSet<>();
        setHash.add("First");
        setHash.add("Second");
        setHash.add("Third");
        setHash.add("First");

        System.out.println("Maintainst the hash value "+setHash);

        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.add("First");
        setLinked.add("Second");
        setLinked.add("Third");
        setLinked.add("First");
        setLinked.add("Fourth");

        System.out.println("Maintains the insertion order "+setLinked);

        Set<String> setTree = new TreeSet<>();
        setTree.add("One");
        setTree.add("Two");
        setTree.add("Three");
        setTree.add("Four");

        System.out.println("Alphabetical order "+setTree);
        System.out.println("--------------------------------");
        System.out.println("Operations on Set interface");
        setLinked.addAll(setTree);
        System.out.println("Union : "+setLinked);
        setLinked.removeAll(setTree);
        System.out.println("Difference: "+setTree);
        System.out.println("If we do the union using setTree first the items will be ordered alphabetically");
        setTree.addAll(setLinked);
        System.out.println("Aplhabetical union"+setTree);
        setLinked.retainAll(setHash);
        System.out.println("Intersection: "+setLinked);
    }
}
