package com.itea.java.basic.l20.classwork;

@FunctionalInterface
public interface DefaultMethodExampleInterface {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default implementation");
    }

    static void foo() {
        System.out.println("foo");
    }
}
