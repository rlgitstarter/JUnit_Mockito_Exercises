package com.tutorialspoint.sequ1;

import org.junit.Test;
import org.junit.runner.Result;

import static org.junit.Assert.*;

public class TestUnit1 {
    @Test
    public void testAdd() {
        // test data
        int num = 5;
        String temp = null;
        String str = "JUnit is working fine";

        // check for equality
        assertEquals("JUnit is working fine", str);

        // check for false conditions
        assertFalse(num > 6);
        //assertTrue(num > 6);
        /* Das ergibt folgendes:
        java.lang.AssertionError
        Process finished with exit code -1
        */

        // check for not null value
        assertNotNull(str);
    }
}
