package com.globant.guru99.junit.annotations.test_expected;

import com.globant.guru99.junit.annotations.ignore.JUnitMessage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {

    public String message = "Saurabh";

    JUnitMessage jUnitMessage = new JUnitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJUnitMessage() {
        System.out.println("JUnit Message is printing");
        jUnitMessage.printMessageError();
    }

    @Test
    public void testJUnitHiMessage() {
        message = "Hi!" + message;
        System.out.println("JUnit Hi Message is printing");
        assertEquals(message, jUnitMessage.printHiMessage());
        System.out.println("Suite Test 2 is successful " + message);
    }
}
