package com.harsh.stringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) throws Exception {

//        base case for empty string
        if (numbers.isEmpty()) {
            return 0;
        }
//        we split the input string by comma or new line character
//        and store the result in an array
//        this gives us a list of numbers
        String delimeters = ",|\n";

//        we check if the input contains a custom delimeter
        if (numbers.startsWith("//")) {
            int indexOfNewLine = numbers.indexOf("\n");
            String delimeterSection = numbers.substring(2, indexOfNewLine);

//        we check if the custom delimeter is in square brackets
            if (delimeterSection.startsWith("[")) {
                List<String> delimetersList = new ArrayList<>();
                Matcher matcher = Pattern.compile("\\[(.*?)\\]").matcher(delimeterSection);
                while (matcher.find()) {
                    String customDelimeter = matcher.group(1);
                    customDelimeter = Pattern.quote(customDelimeter); // quote the custom delimeter to avoid regex issues
                    delimetersList.add(customDelimeter);
                }
                delimeters += "|" + String.join("|", delimetersList);
            } else {
                delimeterSection = Pattern.quote(delimeterSection);// quote the custom delimeter to avoid regex issues
                System.out.println("Custom Delimeter: " + delimeterSection);
                // if the custom delimeter is not in square brackets, we add it to the delimeters
                delimeters += "|" + delimeterSection;
            }
            // we remove the custom delimeter section from the input string
            numbers = numbers.substring(indexOfNewLine + 1);
        }
        System.out.println("Delimeters: " + delimeters);
        //          we seperate the strings by the delimeters
        String[] numArray = numbers.split(delimeters);

//        print the numbers array for debugging
//        System.out.println("Numbers Array: " + String.join(", ", numArray));
//        for single number
        if (numArray.length == 1 && Integer.parseInt(numArray[0]) >= 0) {
            return Integer.parseInt(numArray[0]);
        }

        //        for more than one number
        int sum = 0;

        //    list of negative numbers
        ArrayList<String> negatives = new ArrayList<String>();
        for (
                String item : numArray) {
            if (item.isEmpty()) {
//        continue if the item in array is a empty string
                continue;
            }

            if (Integer.parseInt(item) >= 1000) {
//        if the item is greater than 1000, we ignore it
                continue;
            }

//        if the item is positive, we add it to the sum
            if (Integer.parseInt(item) >= 0) {
                sum += Integer.parseInt(item);
            }
            if (Integer.parseInt(item) < 0) {
//        if the item is negative, we add it to the negatives list
                negatives.add(item);
            }
        }
//        if the negative list not empty, we throw an exception and include all the negative numbers
        if (!negatives.isEmpty()) {
//        if there are negative numbers, we throw an exception
            throw new Exception("Negatives Numbers are not allowed: " + String.join(",", negatives));
        }
//        return the sum of numbers
        return sum;
    }
}
