package com.itea.java.basic.l20;

public class ThisAccessExample {

    public static void main(String[] args) {
        ThisAccessExample thisAccessExample = new ThisAccessExample();
    }

    public ThisAccessExample() {
        int a = 100;
        Runnable r1 = () -> System.out.println(this);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(a);
            }
        };
        r1.run();
        r2.run();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
