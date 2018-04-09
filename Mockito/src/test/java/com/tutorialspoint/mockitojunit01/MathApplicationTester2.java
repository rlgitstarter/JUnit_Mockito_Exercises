package com.tutorialspoint.mockitojunit01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester2 {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test
    public void testCalc() {
        // add the behaviour of calc service to add two numbers (create working mock object)
        when(calcService.add(10.0, 20.0)).thenReturn(30.0);
        // add the behaviour of calc service to subtract two numbers (create working mock object)
        when(calcService.subtract(15.0, 10.0)).thenReturn(5.0);

        // test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0 );
        // test the subtract functionality
        Assert.assertEquals(mathApplication.subtract(15.0,10.0), 5.0,0);
        // default call count is 1
        verify(calcService).subtract(15.0, 10.0);
        // check if add function is called 3 times
        // order of the arguments has to be kept, this causes an error:
        // verify(calcService, times(3)).add(20.0, 10.0);
        verify(calcService, times(3)).add(10.0, 20.0);
        // verify that method was never called on a mock
        verify(calcService, never()).multiply(15.0, 20.0);
    }
}
