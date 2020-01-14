package com.itea.java.basic.l20;

import java.util.function.IntBinaryOperator;

public class PassLambdaExample {

    public static void main(String[] args) {
        System.out.println(compute((d1, d2) -> d1 + d2, 5, 12)); // 17
        System.out.println(compute((d1, d2) -> d1 - d2, 17, 3)); // 14
        System.out.println(compute((d1, d2) -> d1 % d2, 21, 14)); // 7
    }

    private static int compute(IntBinaryOperator operator, int d1, int d2) {
        return operator.applyAsInt(d1, d2);
    }
}
