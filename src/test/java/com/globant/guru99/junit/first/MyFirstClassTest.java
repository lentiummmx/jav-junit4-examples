package com.globant.guru99.junit.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstClassTest {
    @Test
    public void myFirstMethod() {
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine", str);
    }
}
