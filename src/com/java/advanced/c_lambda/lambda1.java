package com.java.advanced.c_lambda;

interface Draw
{
    public void drawing();
}

interface Drew{
    public void drew();
}

public class lambda1 {
    public static void main(String[] args) {
        System.out.println("Lambda");

        Draw dr = new Draw() {
            @Override
            public void drawing() {
                System.out.println("Drawing");
            }
        };
        dr.drawing();

        /*
        The Lambda expression is used to provide the implementation of an interface which has functional interface.
        It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation.
        Here, we just write the implementation code.
        */

        Draw drew = ()->  {
                System.out.println("Drew");
            };
        drew.drawing();
    }
}
