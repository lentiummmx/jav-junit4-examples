package com.globant.howtodoinjava.test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestFeatureOne.class, TestFeatureTwo.class})
public class TestFeatureSuite {
}
