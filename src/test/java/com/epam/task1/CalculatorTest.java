package com.epam.task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;
    double expectedResult;
    double actualResult;

    @Before
    public void setCalc(){

        calculator = new Calculator();

    }

    @After
    public void checkResult(){

        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void addTestShouldAddPositiveNumbers() {

        actualResult = calculator.add(1, 2);
        expectedResult = 3;

    }

    @Test
    public void addTestShouldAddNegativeNumbers() {

        actualResult = calculator.add(-1, 2);
        expectedResult = 1;

    }

    @Test
    public void addTestShouldAddFloatNumbers() {

        actualResult = calculator.add(1.2, 2);
        expectedResult = 3.2;

    }

    @Test
    public void addTestShouldSubtractPositiveNumbers() {

        actualResult = calculator.subtract(5, 2);
        expectedResult = 3;

    }

    @Test
    public void addTestShouldSubtractNegativeNumbers() {

        actualResult = calculator.subtract(-5, 2);
        expectedResult = -7;

    }

    @Test
    public void addTestShouldSubtractFloatNumbers() {

        actualResult = calculator.subtract(5.2, 2);
        expectedResult = 3.2;

    }

    @Test
    public void addTestShouldMultiplyPositiveNumbers() {

        actualResult = calculator.multiply(5, 2);
        expectedResult = 10;

    }

    @Test
    public void addTestShouldMultiplyNegativeNumbers() {

        actualResult = calculator.multiply(-5, 2);
        expectedResult = -10;

    }

    @Test
    public void addTestShouldMultiplyFloatNumbers() {

        actualResult = calculator.multiply(5.2, 2);
        expectedResult = 10.4;

    }

    @Test
    public void addTestShouldDividePositiveNumbers() {

        actualResult = calculator.divide(5, 2);
        expectedResult = 2.5;

    }

    @Test
    public void addTestShouldDivideNegativeNumbers() {

        actualResult = calculator.divide(-5, 2);
        expectedResult = -2.5;

    }

    @Test
    public void addTestShouldDivideFloatNumbers() {

        actualResult = calculator.divide(5.2, 2);
        expectedResult = 2.6;

    }
}
