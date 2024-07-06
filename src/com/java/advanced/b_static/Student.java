package com.java.advanced.b_static;

public class Student {
    public static int count=0;
    private int id;
    private String name;
    private int age;

    Student(){
        count++;
    }

    static {
        System.out.println("Staticssss");
        System.out.println("Hello from static block");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNoOfStudents(){
        return count;
    }
}
