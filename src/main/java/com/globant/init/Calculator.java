package com.globant.init;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String sumand: expression.split("\\+"))
            sum += Integer.valueOf(sumand);
        return sum;
    }

    public int evaluateWillFail(String expression) {
        int sum = 0;
        for (String sumand: expression.split("\\+"))
            sum -= Integer.parseInt(sumand);
        return sum;
    }
}
