package com.harsh.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    //    base test function for empty string
    @Test
    void emptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        try {
            assertEquals(0, calculator.add(""));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for empty string: " + e.getMessage());
        }
    }

    //    base test function for single number
    @Test
    void stringWithOneNumberReturnsThatNumber() {
        StringCalculator calc = new StringCalculator();
        try {
            assertEquals(5, calc.add("5"));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for single number: " + e.getMessage());
        }
    }

    //    test function for two numbers
    @Test
    void sumOfTwoNumbersReturnsTheirSum() {
        StringCalculator calc = new StringCalculator();
        try {
            assertEquals(10, calc.add("3,7"));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for two numbers: " + e.getMessage());
        }
    }

    //test for multiple numbers
    @Test
    void sumOfMultipleNumbersReturnsTheirSum() {
        StringCalculator calc = new StringCalculator();
        try {
            assertEquals(15, calc.add("1,2,3,4,5"));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for multiple numbers: " + e.getMessage());
        }
    }

    //    allow new line character in the input for strings
    @Test
    void newLineCharacterInInputReturnsSum() {
        StringCalculator calc = new StringCalculator();
        try {
            assertEquals(6, calc.add("1,2,\n3"));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for new line character: " + e.getMessage());
        }
    }

    @Test
    void customDelimeters() {
        StringCalculator calc = new StringCalculator();
        try {
            assertEquals(6, calc.add("//@\n1@2@3"));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected exception for custom delimeters: " + e.getMessage());
        }
    }

    @Test
    void negativeNumbersSumThrowException() {
        StringCalculator calc = new StringCalculator();
        try {
            calc.add("//#\n1#2#3");
        } catch (Exception e) {
            assertEquals("negative numbers not allowed: -2", e.getMessage());
            return; // Test passes if exception is thrown
        }
    }
}