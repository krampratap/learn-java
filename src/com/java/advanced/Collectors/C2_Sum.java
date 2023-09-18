package com.java.advanced.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_Sum {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        double sumDouble = productsList.stream().collect(Collectors.summingDouble(x->x.price));
        System.out.println("Prices sum "+sumDouble);

        int sumInt = productsList.stream().collect(Collectors.summingInt(x->(int)x.price));
        System.out.println("Prices sum "+sumInt);

        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);

        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);
    }

}
