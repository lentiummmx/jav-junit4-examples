package com.globant.howtodoinjava.intro;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class Example {

    @BeforeClass
    public static void setup() {}

    @Before
    public void setupThis() {}

    @Test
    public void method() {
        assertTrue(new ArrayList<>().isEmpty());
    }

    @After
    public void tearThis() {}

    @AfterClass
    public static void tearDown() {}
}
