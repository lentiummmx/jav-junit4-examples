package com.globant.howtodoinjava.test_suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunningTestFeatureSuite {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestFeatureSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result :: " + result.wasSuccessful());
    }
}
