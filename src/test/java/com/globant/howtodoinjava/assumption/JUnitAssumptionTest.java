package com.globant.howtodoinjava.assumption;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class JUnitAssumptionTest {

    /**
     * Cfg for Global Assumption
     */
    @Before
    public void setUp() {
        String versionNumber = "7";   // Get it from configuration on runtime
        Assume.assumeTrue(Integer.valueOf(versionNumber) == 7);
    }

    @Test
    public void testIfVersionGreaterThan4_LocalAssumption() {
        String versionNumber = "7";   // Get it from configuration on runtime
        Assume.assumeTrue(Integer.valueOf(versionNumber) == 7);
        System.out.println("Test executed");
    }

    @Test
    public void testIfVersionGreaterThan4_GlobalAssumption() {
        System.out.println("Test executed");
    }
}
