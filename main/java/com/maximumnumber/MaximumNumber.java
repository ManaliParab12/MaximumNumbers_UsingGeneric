package com.maximumnumber;

public class MaximumNumber <T extends Comparable>  {
    private T value1;
    private T value2;
    private T value3;

    public MaximumNumber (T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T checkMaximumValue(){
        return MaximumNumber.checkMaximumValue(value1, value2, value3);
    }

    public static <T extends Comparable> T checkMaximumValue(T value1, T value2, T value3) {
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

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");
    }
}
