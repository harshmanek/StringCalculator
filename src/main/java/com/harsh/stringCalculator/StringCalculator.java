package com.harsh.stringCalculator;

import java.util.regex.Pattern;

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
//        this gives us a list of numbers
        String delimeters = ",|\n";

        if(numbers.startsWith("//")){
            int delemiterIndex = numbers.indexOf("\n");
//            if the string starts with //, we extract the custom delimeter
            String customDelimeter = numbers.substring(2, delemiterIndex);
//            quote the custom delimeter to avoid regex issues
            customDelimeter= Pattern.quote(customDelimeter);
//            add the custom delimeter to the delimeters string
            delimeters+= "|" + customDelimeter;

//            trim the delimeter part from the numbers string
            numbers = numbers.substring(delemiterIndex + 1);
        }
//          we seperate the strings by the delimeters
        String[] numArray = numbers.split(delimeters);
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