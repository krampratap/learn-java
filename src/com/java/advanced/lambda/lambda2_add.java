package com.java.advanced.lambda;

interface IAdd
{
    public int add(int a,int b);
}

public class lambda2_add {
    public static void main(String[] args)
    {
        IAdd ad1 = (a,b) -> (a+b);
        System.out.println(ad1.add(10,20));

        IAdd ad2 = (a,b) -> {
            return a+b;
        };
        System.out.println(ad2.add(20,20));
    }
}
