package com.tutorialspoint.sequ1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestUnit2 extends TestCase {

    private double fValue1;
    private double fValue2;

    @Before
    public void setUp() {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        // count the number of test cases
        System.out.println("No of Test Case = " + this.countTestCases());

        // test getName
        String name = this.getName();
        System.out.println("Test Case Name = " + name);

        // test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = " + newName);
    }

    public void tearDown() {

    }
}
