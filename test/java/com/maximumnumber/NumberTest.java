package com.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {
    MaximumNumber maximumnumber = new MaximumNumber();
    @Test
    public void givenMaximumInteger_whenAtFirstPosition_shouldReturnSameNumber(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(42, 23, 1);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtSecondPosition_shouldReturnSameNumber(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(1, 42, 23);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtThirdPosition_shouldReturnSameNumber(){
        Integer actualMaximumInteger = maximumnumber.checkMaximumInteger(23, 1, 42);
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumFloat_whenAtFirstPosition_shouldReturnSameNumber(){
        Float actualMaximumFloat = maximumnumber.checkMaximumFloat(40.44f, 12.7f, 2.54f );
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }

    @Test
    public void givenMaximumIFloat_whenAtSecondPosition_shouldReturnSameNumber(){
        Float actualMaximumFloat = maximumnumber.checkMaximumFloat( 2.54f, 40.44f, 12.7f);
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }

    @Test
    public void givenMaximumFloat_whenAtThirdPosition_shouldReturnSameNumber(){
        Float actualMaximumFloat = maximumnumber.checkMaximumFloat(12.7f, 2.54f, 40.44f);
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }
}
