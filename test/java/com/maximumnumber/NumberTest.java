package com.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {

    @Test
    public void givenMaximumInteger_whenAtFirstPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(42, 23, 1);
        Integer actualMaximumInteger = (Integer) maximumnumber.checkMaximumValue();
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtSecondPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(1, 42, 23);
        Integer actualMaximumInteger = (Integer) maximumnumber.checkMaximumValue();
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumInteger_whenAtThirdPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(23, 1, 42);
        Integer actualMaximumInteger = (Integer) maximumnumber.checkMaximumValue();
        Integer expectedMaximumNumber = 42;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumInteger);
    }

    @Test
    public void givenMaximumFloat_whenAtFirstPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(40.44f, 12.7f, 2.54f);
        Float actualMaximumFloat = (Float) maximumnumber.checkMaximumValue();
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }

    @Test
    public void givenMaximumIFloat_whenAtSecondPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(2.54f, 40.44f, 12.7f);
        Float actualMaximumFloat = (Float) maximumnumber.checkMaximumValue();
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }

    @Test
    public void givenMaximumFloat_whenAtThirdPosition_shouldReturnSameNumber(){
        MaximumNumber maximumnumber = new MaximumNumber(12.7f, 2.54f, 40.44f);
        Float actualMaximumFloat = (Float) maximumnumber.checkMaximumValue();
        Float expectedMaximumNumber = 40.44f;
        Assert.assertEquals(expectedMaximumNumber, actualMaximumFloat);
    }

    @Test
    public void givenMaximumString_whenAtFirstPosition_shouldReturnSameValue(){
        MaximumNumber maximumnumber = new MaximumNumber("Peach", "Banana", "Apple");
        String actualMaximumString = (String) maximumnumber.checkMaximumValue();
        String expectedMaximumNumber = "Peach";
        Assert.assertEquals(expectedMaximumNumber, actualMaximumString);
    }

    @Test
    public void givenMaximumIString_whenAtSecondPosition_shouldReturnSameValue(){
        MaximumNumber maximumnumber = new MaximumNumber("Apple", "Peach", "Banana");
        String actualMaximumString = (String) maximumnumber.checkMaximumValue();
        String expectedMaximumNumber = "Peach";
        Assert.assertEquals(expectedMaximumNumber, actualMaximumString);
    }

    @Test
    public void givenMaximumString_whenAtThirdPosition_shouldReturnSameValue(){
        MaximumNumber maximumnumber = new MaximumNumber("Banana", "Apple", "Peach");
        String actualMaximumString = (String) maximumnumber.checkMaximumValue();
        String expectedMaximumNumber = "Peach";
        Assert.assertEquals(expectedMaximumNumber, actualMaximumString);
    }

}}