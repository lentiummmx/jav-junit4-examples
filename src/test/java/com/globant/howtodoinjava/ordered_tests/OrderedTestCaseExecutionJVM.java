package com.globant.howtodoinjava.ordered_tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Running test cases in order of method returned by the JVM
 */
//@FixMethodOrder(MethodSorters.DEFAULT)
@FixMethodOrder(MethodSorters.JVM)
public class OrderedTestCaseExecutionJVM {
    @Test
    public void secondTest() {
        System.out.println("Executing second test");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test");
    }

    @Test
    public void thirdTest() {
        System.out.println("Executing third test");
    }
}
