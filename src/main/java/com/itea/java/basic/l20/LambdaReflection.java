package com.itea.java.basic.l20;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LambdaReflection {

    public static void main(String[] args) {

        int i = 100;
        double j = 200;
        Runnable runnable = () -> System.out.println(i + j);

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(i + j);
            }
        };

        printClassHierarchy(runnable);
        printFields(runnable);
        printMethods(runnable);
        System.out.println();
        printClassHierarchy(runnable2);
        printFields(runnable2);
        printMethods(runnable2);
    }

    private static void printClassHierarchy(Object obj) {
        Class type = obj.getClass();
        while (type != null) {
            System.out.println(type.getName());
            type = type.getSuperclass();
        }
    }

    private static void printFields(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(obj);
                System.out.println(name + " = " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printMethods(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
