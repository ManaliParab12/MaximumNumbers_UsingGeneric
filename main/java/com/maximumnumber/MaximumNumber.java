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

    public static<T extends Comparable> T printMaximum(T[] value, T maximum) {
        for( T values : value) {
            System.out.println(values);
        }
        System.out.println("Maximum" +maximum);
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");
        Integer[] intArr = {23, 15, 67, 2};
        Float[] floatArr = {2.6f, 45.2f, 9.54f, 90.2f};
        String[] stringArr = {"Apple", "Orange", "Banana", "Peach"};
        MaximumNumber.checkMaximumValue(intArr);
        MaximumNumber.checkMaximumValue(floatArr);
        MaximumNumber.checkMaximumValue(stringArr);
        new MaximumNumber(floatArr);
        new MaximumNumber(stringArr);
    }
}
