package com.globant.howtodoinjava.intro;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class Assertions {
    @Test
    public void method() {
        assertTrue(new ArrayList<>().isEmpty());
    }
}
