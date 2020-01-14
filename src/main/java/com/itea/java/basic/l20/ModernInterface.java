package com.itea.java.basic.l20;

import java.time.LocalDateTime;

public interface ModernInterface {

    int VALUE = 1;
    String LINE = "I am a const";
    LocalDateTime LOCAL_DATE_TIME = LocalDateTime.now();

    static void methodExample() {
        System.out.println("It is a static method body");
    }
}
