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
//        we split the input string by comma or new line character
//        and store the result in an array
//        this gives us a list of
        String[] numArray = numbers.split(",|\n");
        for(String item : numArray) {
            System.out.println("Item: " + item);
        }
//        for single number
        if (numArray.length == 1) {
            return Integer.parseInt(numArray[0]);
        }
//        for more than one number
        int sum = 0 ;
        for (String item : numArray) {
            if (item.isEmpty()) {
//        continue if the item in array is a empty string
                continue;
            }
            sum += Integer.parseInt(item);
        }
//        return the sum of numbers
        return sum;
    }
}