package com.harsh.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    //    base test function for empty string
    @Test
    void emptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    //    base test function for single number
    @Test
    void stringWithOneNumberReturnsThatNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("5"));
    }

    //    test function for two numbers
    @Test
    void sumOfTwoNumbersReturnsTheirSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(10, calc.add("3,7"));
    }

    //test for multiple numbers
    @Test
    void sumOfMultipleNumbersReturnsTheirSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(15, calc.add("1,2,3,4,5"));
    }

    //    allow new line character in the input for strings
    @Test
    void newLineCharacterInInputReturnsSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,2,\n3"));
    }
    @Test
    void customDelimeters(){
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("//@\n1@2@3"));
    }
}