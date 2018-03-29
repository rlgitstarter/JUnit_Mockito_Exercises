package com.tutorialspoint.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {
    private String message = "Hello JUnit-Testing-World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {

        assertEquals(message, messageUtil.printMessage());
    }
}
