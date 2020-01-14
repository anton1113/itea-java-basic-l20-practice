package com.itea.java.basic.l20;

public class LambdaExample {

    public static void main(String[] args) {

        Action action = () -> System.out.println("Hey hou");
    }

    private interface Action {
        void doAction();
    }
}
