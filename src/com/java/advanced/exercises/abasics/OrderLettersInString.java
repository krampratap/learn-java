package com.java.advanced.exercises.abasics;

import java.util.Arrays;

public class OrderLettersInString {
    //Useful in anagrams
    public static void main(String[] args) {
        String str = "test";
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String sortedStr = new String(c);
        System.out.println(sortedStr);
    }
}
