package com.globant.guru99.junit.annotations.ignore;

public class JUnitMessage {

    private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return this.message;
    }

    public void printMessageError() {
        System.out.println(message);
        int divide = 1 / 0;
    }

    public String printHiMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
