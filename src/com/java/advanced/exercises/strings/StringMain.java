package com.java.advanced.exercises.strings;

public class StringMain {
    public static void main(String[] args) {
        String str = "Testing";
        System.out.println("If you want to get one char and assign to String");
        String getOneLetterFromStr = String.valueOf(str.charAt(1));
        System.out.println(getOneLetterFromStr);

    }
}
