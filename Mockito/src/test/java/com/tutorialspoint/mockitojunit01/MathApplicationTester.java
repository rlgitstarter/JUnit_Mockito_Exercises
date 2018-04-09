package com.tutorialspoint.mockitojunit01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd() {
        // add the behaviour of calc service to add two numbers (create working mock object)
        when(calcService.add(10.0, 20.0)).thenReturn(30.0);
        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0, 0.0);
        // verify the behaviour
        verify(calcService).add(10.0, 20.0);
    }
}
