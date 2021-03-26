package com.globant.guru99.junit.parameterized;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArithmeticTest {

    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmetic arithmetic;

    @Ignore
    @Test
    public void testArithmeticTest(){
        // assert statements
        assertEquals("10 + 10 must be 20", 20, arithmetic.sum(10, 10));
        assertEquals("20 + 20 must be 40", 40, arithmetic.sum(20, 20));
        assertEquals("30 + 10 must be 40", 40, arithmetic.sum(30, 10));
    }

    public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        arithmetic = new Arithmetic();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                {1, 2, 3},
                {11, 22, 33},
                {111, 222, 333},
                {10, 9, 19},
                {100, 9, 109},
        });
    }

    @Test
    public void sum() {
        System.out.println("sum of numbers =: " + expectedResult);
        assertEquals(expectedResult, arithmetic.sum(firstNumber, secondNumber));
    }
}