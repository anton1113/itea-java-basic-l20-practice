package com.itea.java.basic.l20;

public class LocalVarLambdaExample {

    public static void main(String[] args) {
        int i = 100;
        Runnable r = () -> System.out.println(i);

    }
}
