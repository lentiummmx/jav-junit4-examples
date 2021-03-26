package com.globant.guru99.junit.annotations.ignore;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class JUnitTestExample {

    public String message = "Guru99";

    JUnitMessage jUnitMessage = new JUnitMessage(message);

//    @Ignore("not yet ready , Please ignore.")
    @Test
    public void testJUnitMessage() {
        System.out.println("JUnit Message is printing");
        assertEquals(message, jUnitMessage.printMessage());
    }

    @Test
    public void testJUnitHiMessage() {
        message = "Hi!" + message;
        System.out.println("JUnit Hi Message is printing");
        assertEquals(message, jUnitMessage.printHiMessage());
    }

}
