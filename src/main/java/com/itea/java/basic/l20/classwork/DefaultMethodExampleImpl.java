package com.itea.java.basic.l20.classwork;

public class DefaultMethodExampleImpl implements DefaultMethodExampleInterface {

    public static void main(String[] args) {

        DefaultMethodExampleImpl impl = new DefaultMethodExampleImpl();
        impl.abstractMethod();
        impl.defaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Overriden implementation");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overriden implementation");
    }
}
