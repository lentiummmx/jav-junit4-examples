package com.globant.guru99.junit.test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyFirstClassTest.class, MySecondClassTest.class})
public class TestSuiteExample {
}
