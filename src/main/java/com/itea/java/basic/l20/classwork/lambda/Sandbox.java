package com.itea.java.basic.l20.classwork.lambda;

public class Sandbox {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Run my runnable");
            System.out.println("fesgsgs");
            System.out.println("grsget");
        };
        runnable.run();

        System.out.println(runnable.getClass().getSimpleName());
    }

    @FunctionalInterface
    public interface IExample {

        String lambdaExpression(String lambda1, String lambda2);
    }
}
