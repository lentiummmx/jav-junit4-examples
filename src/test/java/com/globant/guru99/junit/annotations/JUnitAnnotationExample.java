package com.globant.guru99.junit.annotations;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JUnitAnnotationExample {

    private ArrayList<String> list;

    @BeforeClass
    public static void m1(){
        System.out.println("Using @BeforeClass, executed before all test cases");
    }

    @Before
    public void m2() {
        System.out.println("Using @Before annotations, executed before each test cases");
    }

    public static void m3() {
        System.out.println("Using @AfterClass, executed, after all test cases");
    }

    @After
    public void m4() {
        System.out.println("Using @After, executed after each test cases");
    }

    @Test
    public void m5() {
        list.add("test");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Ignore
    @Test
    public void m6() {
        System.out.println("Using @Ignore, this execution is ignored");
    }

    @Test(timeout = 10)
    public void m7() {
        System.out.println("Using @Test(timeout), it can be used to enforce timeout in JUnit4 test case");
    }

    @Test(expected = NoSuchMethodException.class)
    public void m8() {
        System.out.println("Using @Test(expected), it will check for specified exception during its execution");
    }

}
