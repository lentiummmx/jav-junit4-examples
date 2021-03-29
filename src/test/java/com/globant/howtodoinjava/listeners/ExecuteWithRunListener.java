package com.globant.howtodoinjava.listeners;

import com.globant.howtodoinjava.test_suite.TestFeatureOne;
import com.globant.howtodoinjava.test_suite.TestFeatureTwo;
import org.junit.runner.JUnitCore;

public class ExecuteWithRunListener {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        // Adding listener here
        jUnitCore.addListener(new ExecutionListener());
        jUnitCore.run(TestFeatureOne.class, TestFeatureTwo.class);
    }
}
