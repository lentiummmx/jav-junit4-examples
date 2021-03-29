package com.globant.howtodoinjava.exec_mvn;

import org.junit.Test;

/**
 * 1) Run all testcases with command “mvn test” : This command run all testcases present inside test
 * folder irrespective of any other criteria.
 *
 * 2) Execute a particular test class only with “-Dtest=TestSurefire test” : This will execute all
 * testcases inside test class TestSurefire.
 * You can use multiple test classes in command and even use wild cards in test class names to match
 * a set of test classes. e.g. mvn -Dtest=TestSurefire,TestOth*Class test
 *
 * 3) Test only a certain testcase inside test class with “mvn -Dtest=TestSurefire#testcaseFirst test“:
 * This command will execute only single test case method i.e. testcaseFirst().
 *
 * 4) Test multiple test cases with wild card mapping e.g. “mvn -Dtest=TestSurefire#testcase* test“:
 * This will help to run multiple testcases with similar names in one simple short command.
 */
public class TestSurefire {

    @Test
    public void testCaseFirst(){
        System.out.println("First testCase executed");
    }

    @Test
    public void testCaseSecond(){
        System.out.println("Second testCase executed");
    }

    @Test
    public void testCaseThird(){
        System.out.println("Third testCase executed");
    }

    @Test
    public void otherTestCase(){
        System.out.println("Another testCase executed");
    }
}
