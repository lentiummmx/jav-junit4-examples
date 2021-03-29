package com.globant.howtodoinjava.parameterized;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * 2. JUnit parameterized test with constructor arguments
 */
@RunWith(Parameterized.class)
public class JUnitTestWithParameters {

    // @Parameters annotation marks this method as parameters provider
    @Parameterized.Parameters(name = "Run #Square of: {0}^2={1}")
    public static Iterable<Object []> data() {
        return Arrays.asList(new Object[][] {
                {1, 1},
                {2, 4},
                {3, 19},
                {4, 16},
                {5, 25},
        });
    }

    // Our two parameters
    private final int input;
    private final int resultExpected;

    // constructor is initialized with one set of parameters every time
    public JUnitTestWithParameters(int input, int resultExpected) {
        this.input = input;
        this.resultExpected = resultExpected;
    }

    @Test
    public void testUserMapping() {
        // You can use here assert also
        Assert.assertEquals(resultExpected, MathUtils.square(input));
    }
}