package com.java.advanced.f_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionMain {
    public static void main(String[] args) {
        /*Function is a Functional Interface. In Predicate we just store the condition. Function can perform logic*/
        Function<String, Integer> getLength = x -> x.length();
        //Function<String, Integer> getLength = String::length;
        Function<String, String> getFirstThreeCharacters = x -> x.substring(0, 3);
        System.out.println("Length of string Ram"+ getLength.apply("Ram"));

        Function<List<Student>, List<Student>> startsWithGopPrefix = (list) -> {
            List<Student> students = new ArrayList<>();
            for (Student s : list) {
                if (getFirstThreeCharacters.apply(s.getName()).equalsIgnoreCase("gop")) {
                    students.add(s);
                }
            }
            return students;
        };

        Student s1 = new Student(1,"Gopal");
        Student s2 = new Student(2,"Gopinath");
        Student s3 = new Student(3,"sanj");
        List<Student> students = Arrays.asList(s1,s2,s3);

        System.out.println(startsWithGopPrefix.apply(students));

        System.out.println("Try with Predicate");
        Predicate<String> predicate = x->x.substring(0,3).equalsIgnoreCase("Gop");
        System.out.println(students.stream().map(x->x.name).filter(predicate).toList());

        System.out.println("------Function chaining-----");
        Function<String,Integer> chain = getFirstThreeCharacters.andThen(getLength);
        System.out.println(chain.apply("testing"));
    }

    private static class Student {
        private final int id;
        private final String name;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}
