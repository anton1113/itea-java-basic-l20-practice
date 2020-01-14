package com.itea.java.basic.l20;

public class GenericLambda {

    public static void main(String[] args) {

        Function<Integer, String> intToStringFunction = i -> String.valueOf(i);
        Function<String, Integer> stringToIntFunction = s -> Integer.parseInt(s);
    }

    private interface Function<T, K> {

        K convert(T arg);
    }
}
