package org.example.servicetest;

import org.example.service.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTestJunit5 {

    @BeforeAll
    public static void beforeAllTestCase(){
        System.out.println("Before All Test Cases ");
    }

    @AfterAll
    public static void afterAllTestCase(){
        System.out.println("After All test Cases ");
    }

    @BeforeEach
    public void beforeEachTestCases() {
        System.out.println("Before Each Test Cases ");
    }

    @AfterEach
    public void afterEachTestCases (){
        System.out.println("After Each test cases ");
    }

    @Test
    @DisplayName("TwoNumber")
    public void addTwoNumberTest(){
       int actualResult =Calculator.addTwoNumber(10,20);

        Assertions.assertEquals(30 ,actualResult,"Test Failed ");
    }

    @Test
    @Disabled

    public void addAnyNumberTest() {
        int actualResult = Calculator.addAnyNumber(10 ,20,20);

        Assertions.assertEquals(50 ,actualResult);
    }
}
