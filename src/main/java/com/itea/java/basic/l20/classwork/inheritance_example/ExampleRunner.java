package com.itea.java.basic.l20.classwork.inheritance_example;

public class ExampleRunner {

    public static void main(String[] args) {

        JavaStudent javaStudent = new JavaStudent(); //
        javaStudent.speak();

        Human student = new Student();
        student.speak();

        Citizen citizen = new Citizen(); //
        citizen.speak();

        Human human = new Human();
        human.speak();
    }
}
