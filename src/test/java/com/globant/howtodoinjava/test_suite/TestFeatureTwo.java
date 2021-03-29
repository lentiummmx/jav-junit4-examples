package com.globant.howtodoinjava.test_suite;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestFeatureTwo {
    @Test
    public void testSecondFeature() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void testSecondFeatureIgnored() {
        assertTrue(true);
    }
}
