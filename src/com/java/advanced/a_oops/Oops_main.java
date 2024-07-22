package com.java.advanced.a_oops;

import com.java.advanced.a_oops.inheritance.Cat;
import com.java.advanced.a_oops.z_abstraction.Animal;

/*OOPS, is a way of programming - we play with classes and objects
Other style of programming
    1. Imperative - In C, define everything line by line like int a =1 etc
    2. Declarative
    3. Functional - Here you can store function in a variable like a = public static void getColor() { }
*/
public class Oops_main {

    public static void main(String[] args) {
        com.java.advanced.a_oops.encapsulation.Car mustang = new com.java.advanced.a_oops.encapsulation.Car(); //With the help of a bluePrint Car. we are making an object mustang

        mustang.accelerate(1);

        System.out.println();

        Cat c = new Cat();
        //c.breed

    }

}
