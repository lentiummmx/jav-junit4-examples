package com.globant.guru99.junit.test_suite.v2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SuiteTest1.class,
        SuiteTest2.class,
})
public class JUnitTest {
    // this class remains empty, it is used only as a holder for the above annotations
}
