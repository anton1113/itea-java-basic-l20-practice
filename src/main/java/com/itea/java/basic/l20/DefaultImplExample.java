package com.itea.java.basic.l20;

public class DefaultImplExample {

    public static void main(String[] args) {
        ExampleImpl1 exampleImpl1 = new ExampleImpl1();
        ExampleImpl2 exampleImpl2 = new ExampleImpl2();
        exampleImpl1.doSmth();
        exampleImpl2.doSmth();
    }

    private static class ExampleImpl1 implements IExample {

        @Override
        public void doSmth() {
            System.out.println("Override implementation");
        }
    }

    private static class ExampleImpl2 implements IExample {
    }

    private interface IExample {

        default void doSmth() {
            System.out.println("Default implementation");
        }
    }
}
