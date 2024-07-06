package com.java.advanced.b_static;

/*
It is primarily used for memory management
It can be used on
    1. Variables
    2. Methods
    3. Blocks
    4. Nested Functions

The main concept of static is that it belongs to class rather than the instances of the class
When you call a static method then you have no object on which you are calling the static method.. So you cannot use any object
related data meaning non-static data in a static class i.e
    1. Static methods cannot use non-static members or non-static methods directly.
    2. this and super cannot be used in static context
    3. Before any instance is created static variables will be initialized
    4. static block is run when class is loaded into the memory.. NO need to create an object.. it will run
    5. Used in singleton pattern - school
        a. Create private constructor
        b. Create a static variable with School object.
        c. Create a static method which returns the School object so that entire application can use this.
 */
public class StaticMain {
    public static void main(String[] args) { //Main method is also static as JVM will call it directly instead of creating an instance
        Student s = new Student();
        s.setId(1);
        s.setName("Ram");
        s.setAge(19);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println(Student.count);
        System.out.println("No of Students "+Student.getNoOfStudents()); // Static method
    }


}
