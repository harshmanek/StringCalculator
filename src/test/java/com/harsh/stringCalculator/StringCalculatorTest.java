package com.harsh.stringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void emptyStringReturnsZero(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
    @Test
    void stringWithOneNumberReturnsThatNumber(){
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("5"));
    }
}