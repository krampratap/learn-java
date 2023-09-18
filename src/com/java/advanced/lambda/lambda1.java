package com.java.advanced.lambda;

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

        Drew drew = ()->  {
                System.out.printf("Drew");
            };
        drew.drew();
    }
}
