package com.globant.guru99;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
    public void testSetup() {
        String str = "I am done with jUnit setup!";
        assertEquals("I am done with jUnit setup!", str);
    }
}
