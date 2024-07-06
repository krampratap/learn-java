package com.java.advanced.b_static;

public class School {

    private static School school = new School();

    private School(){

    }

    public static School getInstance(){
        return school;
    }
}
