package com.tutorialspoint.mockitojunit01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.mockito.exceptions.base.MockitoException;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester3Exc {
    //@TestSubject annotation is used to identify class which is going to use the mock object,
    //but in EasyMock, not in Mockito.
    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    //Testing exception handling by Mockito
    @Test(expected = RuntimeException.class)
    public void testAdd() {
        // add the behaviour to throw exception
        Mockito.doThrow(new RuntimeException("Add operation not implemented")).
                when(calcService).add(10.0,20.0);

        // test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0.0);
    }

}
