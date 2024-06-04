package com.java.advanced.lambda;

public class lambda6_anonymousFn {
    public static void main(String[] args) {
        Employee e = () -> {
            int salary = 5;
            //System.out.println(this.salary); //Gives error as this is not a class
            System.out.println("10"); //Lambda Function
        };
        e.getSalary();

        Employee e1 = new Employee() { //Anonymous inner class is like a class
            int salary =  5;
            @Override
            public void getSalary() {
                System.out.println(salary);
            }
        };

        e1.getSalary();
    }
}
