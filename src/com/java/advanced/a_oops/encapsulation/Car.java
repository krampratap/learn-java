package com.java.advanced.a_oops.encapsulation;

import com.java.advanced.a_oops.inheritance.Animal;
import lombok.Data;

/*It is a class ( it is a blueprint ). It has properties and behaviour
    1. First create a class and provide fields and methods.
    2. The fields are accessible to anyone.
    3. Use Encapsulation and add private to all the fields so that they are hidden
        Encapsulation - Bundling of data and methods into a single unit (class) and hide the fields and use setters and getters.
*/
@Data
public class Car extends Animal {
    //properties
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;
    //behaviours
    public void accelerate(int increaseSpeed)
    {
       speed += increaseSpeed;
    }
    public void brake(int decreaseSpeed){
        speed-= decreaseSpeed;
        if(speed<0){
            speed=0;
        }
    }
}
