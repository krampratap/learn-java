package com.java.advanced.b_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams2_WithStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
        Predicate<Float> greaterThanFiftyK = x->x>50000;
        List<Float> productsWithPriceGreaterThan50k = productsList.stream()
                                                        .map(x->x.price)
                                                        .filter(greaterThanFiftyK).toList();
        System.out.println(productsWithPriceGreaterThan50k);
        System.out.println(greaterThanFiftyK.test(600000F));
    }
}
