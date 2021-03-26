package com.globant.guru99.fixture.impl;

import org.junit.*;

import java.io.File;

public class OutputFileTest {
    private File output;

    @BeforeClass
    public static void onceOnlySetup() {
        // class setup code here
    }

    @Before
    public void createOutputFile() {
        output = new File("");    // ...
    }

    @After
    public void deleteOutputFile() {
        output.delete();
    }

    @AfterClass
    public static void onceOnlyTeardown() {
        // class cleanup code here
    }

    @Test
    public void testFile1() {
        // code for test case objective
    }

    @Test
    public void testFile2() {
        // code for test case objective
    }
}
