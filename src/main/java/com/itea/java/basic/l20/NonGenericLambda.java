package com.itea.java.basic.l20;

public class NonGenericLambda {

    public static void main(String[] args) {

        IntToStringFunction intToStringFunction = i -> String.valueOf(i);
        StringToIntFunction stringToIntFunction = s -> Integer.parseInt(s);
    }

    private interface IntToStringFunction {

        String convert(int param);
    }

    private interface StringToIntFunction {

        int convert(String param);
    }
}
