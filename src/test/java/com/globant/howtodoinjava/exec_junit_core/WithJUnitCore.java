package com.globant.howtodoinjava.exec_junit_core;

import com.globant.howtodoinjava.test_suite.TestFeatureOne;
import com.globant.howtodoinjava.test_suite.TestFeatureTwo;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.2. Run tests with JUnitCore
 * To run tests for above features only, we can write a suite like this.
 */
public class WithJUnitCore {
    public static void main(String[] args) {
        List<Class> testCases = new ArrayList();

        // Add test cases
        testCases.add(TestFeatureOne.class);
        testCases.add(TestFeatureTwo.class);

        for (Class aClass : testCases) {
            runTestCase(aClass);
        }
    }

    private static void runTestCase(Class testCase) {
        Result result = JUnitCore.runClasses(testCase);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result :: " + result.wasSuccessful());
    }
}
/**
 * 2. JUnitCore run tests from command prompt
 * To run test classes from command prompt manually, we can run following command from console. Give
 * the name of all test classes separated by space.
 *
 * $ java org.junit.runner.JUnitCore TestFeatureOne TestFeatureTwo
 *
 * 3. JUnitCore run all tests
 * It is highly advisable to create JUnit suites and execute application wide all test cases. This
 * will require a little work but still it’s best way to execute all tests in JUnit.
 */
