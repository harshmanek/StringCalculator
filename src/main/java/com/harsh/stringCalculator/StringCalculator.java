package com.harsh.stringCalculator;

public class StringCalculator {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public int add(String numbers){
//        base case for empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numArray = numbers.split(",");
//        for single number
        if (numArray.length == 1) {
            return Integer.parseInt(numArray[0]);
        }
//        for more than one number
        int sum = 0 ;
        for(String num:numArray){
            sum+= Integer.parseInt(num);
        }
//        return the sum of numbers
        return sum;
    }
}