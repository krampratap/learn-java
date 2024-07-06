package com.java.advanced.finaal;

/*
    Final keyword can be on
        1. variables
        2. methods - When class is inherited, the final method cannot be overriden - EvCar class
        3. classes - the class cannot be inherited - airBags method

    Can constructors be made final
        Ans: Final keyword is used to stop methods from overriding..
             as constructor overriding is not feasible so there is no point
 */
public final class Car extends Vehicle{
    //Private cant access but in future someone can come and change the value here in the class
    // private int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    //So you can add final
    private final int speedLimit = 200;

    //private final int carTyres = 4;
    //if the variable is part of the class then make it static
    private static final int carTyres = 4;

    //if you dont initialize it is an issue
    //private static final boolean isCarSteeringAvailable;  //Error
    //You can also initialize in static block if not initialised while declaring
    //You can initialize in constructor also;
    private static final boolean isCarSteeringAvailable;

    static {
        isCarSteeringAvailable = true;
    }

    @Override
    void accelerate() {
        System.out.println("Car Accelerating");
    }


    @Override
    void brake() {
        System.out.println("Car brake");
    }

    public final void airBags(){
        System.out.println("2 Airbags");
    }
}
