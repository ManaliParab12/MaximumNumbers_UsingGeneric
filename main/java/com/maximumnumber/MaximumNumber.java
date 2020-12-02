package com.maximumnumber;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");
        MaximumNumber maximumnumber = new MaximumNumber();
    }

    public Integer checkMaximumInteger(Integer number1, Integer number2, Integer number3) {
        int maximumNumber = number1;

        if (number2.compareTo(maximumNumber) > 0) {
            maximumNumber = number2;
        }
        if(number3.compareTo(maximumNumber) > 0) {
            maximumNumber = number3;
        }
        System.out.println("Maximum Number is : " +maximumNumber );
        return maximumNumber;
    }

    public Float checkMaximumFloat(Float number1, Float number2, Float number3) {
        Float maximumNumber = number1;

        if (number2.compareTo(maximumNumber) > 0) {
            maximumNumber = number2;
        }
        if(number3.compareTo(maximumNumber) > 0) {
            maximumNumber = number3;
        }
        System.out.println("Maximum Number is : " +maximumNumber );
        return maximumNumber;
    }

    public String checkMaximumString(String value1, String value2, String value3) {
        String maximumValue = value1;

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
