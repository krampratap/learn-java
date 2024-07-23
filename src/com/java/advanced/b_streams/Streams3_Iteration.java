package com.java.advanced.b_streams;

import java.util.ArrayList;
import java.util.List;

public class Streams3_Iteration {
      public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1,"HP Laptop",25000f));
            productsList.add(new Product(2,"Dell Laptop",30000f));
            productsList.add(new Product(3,"Lenovo Laptop",28000f));
            productsList.add(new Product(4,"Sony Laptop",28000f));
            productsList.add(new Product(5,"Apple Laptop",90000f));
            // This is more compact approach for filtering data and iterating collection
            productsList.stream()
                    .filter(product -> product.price == 30000)
                    .forEach(product -> System.out.println(product.name));
        }
}
