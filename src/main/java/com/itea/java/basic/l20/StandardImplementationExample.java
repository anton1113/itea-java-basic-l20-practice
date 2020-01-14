package com.itea.java.basic.l20;

public class StandardImplementationExample {

    public static void main(String[] args) {
        Action action = new ActionImpl();
        action.doAction();
    }

    private static class ActionImpl implements Action {

        @Override
        public void doAction() {
            System.out.println("My first lambda!");
        }
    }

    private interface Action {
        void doAction();
    }
}
