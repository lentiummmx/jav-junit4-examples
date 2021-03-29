package com.globant.howtodoinjava.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestTimeout {

    @Test(timeout = 500)
    public void testInfiniteTimeTakingLoopLocal() throws InterruptedException {
        while (true) {
            Thread.currentThread().sleep(1000);
            break;
        }
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Test   // Pass
    public void testInfiniteTimeTakingLoop1Global() throws InterruptedException {
        while (true) {
            Thread.currentThread().sleep(1000);
            break;
        }
    }

    @Test   // Fail
    public void testInfiniteTimeTakingLoop2Global() throws InterruptedException {
        while (true) {
            Thread.currentThread().sleep(5000);
            break;
        }
    }
}
