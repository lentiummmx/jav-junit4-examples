package com.globant.guru99.junit.error_collector;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertTrue;

public class ErrorCollectorExample {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void example() {
        errorCollector.addError(new Throwable("There is an error in first line"));
        errorCollector.addError(new Throwable("There is an error in second line"));
//        errorCollector.checkThat(getResults(), not(containsString("here is an error")));
        // all lines of code will execute and at the end a combined failure will be logged in.
    }

    @Test
    public void example2() {
        errorCollector.addError(new Throwable("There is an error in first line"));
        errorCollector.addError(new Throwable("There is an error in second line"));

        System.out.println("Hello");
        try {
            assertTrue("A " == "B");
        } catch (Throwable t) {
            errorCollector.addError(t);
        }
        System.out.println("World!!!!");
    }

}
