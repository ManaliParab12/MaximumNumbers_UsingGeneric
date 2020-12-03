package com.maximumnumber;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");
        MaximumNumber maximumnumber = new MaximumNumber();
    }

    public static<T extends Comparable <T>> T checkMaximumValue(T value1, T value2, T value3){
        T maximumValue = value1;
        if (value2.compareTo(maximumValue) > 0) {
            maximumValue = value2;
        }
        if(value3.compareTo(maximumValue) > 0) {
            maximumValue = value3;
        }
        System.out.println("Maximum Value is : " +maximumValue );
        return maximumValue;
    }

}
