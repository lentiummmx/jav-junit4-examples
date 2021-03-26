package com.globant.guru99.junit.annotations.ignore;

import com.globant.guru99.junit.annotations.JUnitAnnotationExample;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnitTestExample.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == " + result.wasSuccessful());
    }
}
