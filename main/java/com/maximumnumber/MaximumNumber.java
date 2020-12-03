package com.maximumnumber;

import java.util.Arrays;

public class MaximumNumber <T extends Comparable>  {
    private T [] value;

    public MaximumNumber (T[] value) {
        this.value = value;
    }

    public T checkMaximumValue(){
        return MaximumNumber.checkMaximumValue(value);
    }

    public static <T extends Comparable> T checkMaximumValue(T[] value) {
        Arrays.sort(value);
        int arrayLength = value.length;
        T maximumValue = value[arrayLength - 1];
        System.out.println("Maximum Value :" +maximumValue);
        return maximumValue;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");

    }
}
