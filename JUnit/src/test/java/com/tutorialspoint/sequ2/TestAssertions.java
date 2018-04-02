package com.tutorialspoint.sequ2;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {
    @Test
    public void testAssertions() {
        // div. test data
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        // Check that 2 objects are equal
        assertEquals(str1, str2);
        assertEquals(str4, str5);
        assertEquals(str1,str5);
        // ergibt einen AssertionError; Expected: abc, Actual: null
        // assertEquals(str1,str3);

        // Check that a condtion is true
        assertTrue(val1 < val2);

        // Check that a condition is false
        assertFalse(val1 > val2);

        // Check that an object is not null
        assertNotNull(str1);

        // Check that an object is null
        assertNull(str3);

        // Check if 2 object references point to the same object
        assertSame(str4, str5);

        // Check if 2 object references do not point to the same object
        assertNotSame(str1, str3);

        // Check if 2 arrays are equal to each other
        assertArrayEquals(expectedArray, resultArray);

        System.out.println("all tests passed");
    }
}
