package com.itea.java.basic.l20;

public class LambdaCheckedExceptionExample {

    public static void main(String[] args) throws Exception {
//        IExample iExample = () -> {throw new Exception();};
        IExceptionExample exceptionExample = () -> {throw new Exception();};
    }

    private interface IExample {

        void doSmth();
    }

    private interface IExceptionExample {

        void doSmth() throws Exception;
    }
}
