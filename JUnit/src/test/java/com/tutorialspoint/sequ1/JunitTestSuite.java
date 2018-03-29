package com.tutorialspoint.sequ1;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {

    public static void main(String[] args) {
        TestSuite suite = new TestSuite(TestUnit1.class, TestUnit2.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}
