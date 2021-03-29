package com.globant.howtodoinjava.listeners;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class ExecutionListener extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Number of test to execute: " + description.testCount());
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Number of test executed: " + result.getRunCount());
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Starting execution of test case: " + description.getMethodName());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Finishing execution of test case: " + description.getMethodName());
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Execution of test case failed: " + failure.getMessage());
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Execution of test case ignored: " + description.getMethodName());
    }
}
