package com.tutorialspoint.sequ4;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunitExc {
    private String message = "Robert";
    private MessageUtilExc messageUtilExc = new MessageUtilExc(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessageExc() {
        System.out.println("Inside testPrintMessageExc()");
        messageUtilExc.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message, messageUtilExc.salutationMessage());
    }

}
