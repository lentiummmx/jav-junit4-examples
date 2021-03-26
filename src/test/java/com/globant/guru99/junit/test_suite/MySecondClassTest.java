package com.globant.guru99.junit.test_suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySecondClassTest {
    @Test
    public void mySecondMethod() {
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine", str);
    }
}
