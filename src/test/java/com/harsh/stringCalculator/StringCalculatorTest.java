package com.harsh.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

//    base test function for empty string
    @Test
    void emptyStringReturnsZero(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
//    base test function for single number
    @Test
    void stringWithOneNumberReturnsThatNumber(){
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("5"));
    }
//    test function for two numbers
    @Test
    void sumOfTwoNumbersReturnsTheirSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(10, calc.add("3,7"));
    }
}