package com.tutorialspoint.mockitojunit01;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester4 {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp() {
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAddAndSubtract() {
        // behavior to add/subtract numbers
        when((calcService.add(20.0, 10.0))).thenReturn(30.0);
        when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);
        // test functionality - if only for add, then the mock for (calcService).subtract is  not invoked
        // and vice versa
        // Assert.assertEquals(mathApplication.add(20.0,10.0),30.0,0);
        Assert.assertEquals(mathApplication.subtract(20.0,10.0),10.0,0.0);

        // verify: call to calcService made or not
        verify(calcService).add(20.0,10.0);
        verify(calcService).subtract(20.0,10.0);
    }
}
