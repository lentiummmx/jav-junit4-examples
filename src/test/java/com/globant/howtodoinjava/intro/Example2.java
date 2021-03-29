package com.globant.howtodoinjava.intro;

import static org.junit.Assume.assumeTrue;

public class Example2 {
    public class AppTest {
        void testOnDev() {
            System.setProperty("ENV", "DEV");
            assumeTrue("DEV".equals(System.getProperty("ENV")));
        }

        void testOnProd() {
            System.setProperty("ENV", "PROD");
            assumeTrue("DEV".equals(System.getProperty("ENV")));
        }
    }

}
