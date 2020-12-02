package com.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {
    MaximumNumber maximumnumber = new MaximumNumber();
    @Test
    public void givenMaximumInteger_whenAtFirstPosition_shouldPass(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(42, 23, 1);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtSecondPosition_shouldPass(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(23, 42, 1);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtThirdPosition_shouldPass(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(23, 1, 42);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }
}
