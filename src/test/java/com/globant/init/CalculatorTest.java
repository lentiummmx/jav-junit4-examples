package com.globant.init;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void evaluate() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void evaluateWillFail() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluateWillFail("1+2+3");
        assertEquals(6, sum);
    }
}