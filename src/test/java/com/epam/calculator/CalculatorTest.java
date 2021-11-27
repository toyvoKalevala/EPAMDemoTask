package com.epam.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setCalculator() {
        //given
        calculator = new Calculator();
    }

    @Test
    public void testAddShouldAddPositiveNumbers() {
        //when
        double actualResult = calculator.add(1.0, 2.0);
        //then
        Assert.assertEquals(3.0, actualResult, 0.0);
    }

    @Test
    public void testAddShouldAddNegativeNumbers() {
        //when
        double actualResult = calculator.add(-1.0, 2.0);
        //then
        Assert.assertEquals(1.0, actualResult, 0.0);
    }

    @Test
    public void testAddShouldAddFloatNumbers() {
        //when
        double actualResult = calculator.add(1.2, 2.0);
        //then
        Assert.assertEquals(3.2, actualResult, 0.0);
    }

    @Test
    public void testSubtractShouldSubtractPositiveNumbers() {
        //when
        double actualResult = calculator.subtract(5.0, 2.0);
        //then
        Assert.assertEquals(3.0, actualResult, 0.0);
    }

    @Test
    public void testSubtractShouldSubtractNegativeNumbers() {
        //when
        double actualResult = calculator.subtract(-5.0, 2.0);
        //then
        Assert.assertEquals(-7.0, actualResult, 0.0);
    }

    @Test
    public void testSubtractShouldSubtractFloatNumbers() {
        //when
        double actualResult = calculator.subtract(5.2, 2.0);
        //then
        Assert.assertEquals(3.2, actualResult, 0.0);
    }

    @Test
    public void testMultiplyShouldMultiplyPositiveNumbers() {
        //when
        double actualResult = calculator.multiply(5.0, 2.0);
        //then
        Assert.assertEquals(10.0, actualResult, 0.0);
    }

    @Test
    public void testMultiplyShouldMultiplyNegativeNumbers() {
        //when
        double actualResult = calculator.multiply(-5.0, 2.0);
        //then
        Assert.assertEquals(-10.0, actualResult, 0.0);
    }

    @Test
    public void testMultiplyShouldMultiplyFloatNumbers() {
        //when
        double actualResult = calculator.multiply(5.2, 2.0);
        //then
        Assert.assertEquals(10.4, actualResult, 0.0);
    }

    @Test
    public void testDivideShouldDividePositiveNumbers() {
        //when
        double actualResult = calculator.divide(5.0, 2.0);
        //then
        Assert.assertEquals(2.5, actualResult, 0.0);
    }

    @Test
    public void testDivideShouldDivideNegativeNumbers() {
        //when
        double actualResult = calculator.divide(-5.0, 2.0);
        //then
        Assert.assertEquals(-2.5, actualResult, 0.0);
    }

    @Test
    public void testDivideShouldDivideFloatNumbers() {
        //when
        double actualResult = calculator.divide(5.2, 2.0);
        //then
        Assert.assertEquals(2.6, actualResult, 0.0);
    }
}
