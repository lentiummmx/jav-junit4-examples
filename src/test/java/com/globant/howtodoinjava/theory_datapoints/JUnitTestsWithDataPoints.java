package com.globant.howtodoinjava.theory_datapoints;

import com.globant.howtodoinjava.parameterized.MathUtils;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * 3.1. Single field injection
 * If we have only one field to inject, then we do not need to put value attribute in @Parameter annotation. Default value is always “value=0”.
 */
@RunWith(Theories.class)
public class JUnitTestsWithDataPoints {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @DataPoints
    public static int[][] integers() {
        return new int[][] {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {}
        };
    }

    @DataPoint
    public static int[] input6 = new int[] {6, 36};

    @DataPoint
    public static int[] input7 = new int[] {7, 49};

    @Theory
    public void testSquares(final int[] inputs) {
        Assume.assumeTrue(inputs.length == 2);
        Assume.assumeTrue(inputs[0] > 0 && inputs[1] > 0);
        Assert.assertEquals(inputs[1], MathUtils.square(inputs[0]));
    }

    @Theory
    public void testBlankArray(final int[] inputs) {
        Assume.assumeTrue(inputs.length == 0);
        expectedException.expect(ArrayIndexOutOfBoundsException.class);
        Assert.assertEquals(inputs[1], MathUtils.square(inputs[0]));
    }
}
