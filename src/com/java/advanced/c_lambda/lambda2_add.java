package com.java.advanced.c_lambda;

interface IAdd {
    int add(int a, int b);
}

public class lambda2_add {
    public static void main(String[] args) {
        IAdd ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        IAdd ad2 = (a, b) -> a + b;
        IAdd ad3 = Integer::sum; //Same as above
        System.out.println(ad2.add(20, 20));
        System.out.println(ad3.add(35, 23));
    }
}
