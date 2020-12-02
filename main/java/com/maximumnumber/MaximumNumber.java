package com.maximumnumber;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Number using Generic");
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
}
