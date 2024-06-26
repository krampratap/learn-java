package com.java.advanced.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class C1_FetchDataAsList {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Double> productPriceList =
                productsList.
                        stream().map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list

        System.out.println( productsList.stream().mapToDouble(x -> x.price).sum());
        System.out.println(productPriceList);
    }
}
