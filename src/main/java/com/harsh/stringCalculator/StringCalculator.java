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
//        base case for single number
        if(numbers.length()==1){
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}