package com.globant.howtodoinjava.parameterized;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * 3.1. Single field injection
 * If we have only one field to inject, then we do not need to put value attribute in @Parameter annotation. Default value is always “value=0”.
 */
@RunWith(Parameterized.class)
public class JUnitTestsWithFieldInjection {

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

    @Parameterized.Parameter(value = 0)
    public int input;

    @Parameterized.Parameter(value = 1)
    public int resultExpected;

    @Test
    public void testUserMapping() {
        Assert.assertEquals(resultExpected, MathUtils.square(input));
    }
}
