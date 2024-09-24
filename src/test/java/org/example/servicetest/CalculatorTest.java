//package org.example.servicetest;
//
//import junit.framework.TestCase;
//import org.example.service.Calculator;
//import org.junit.*;
//import org.junit.jupiter.api.Test;
//
//import java.util.Date;
//
//
//public class CalculatorTest {
//
//    @BeforeClass
//    public static void beforeAllTestCase(){
//
//        System.out.println("Before all test cases" + new Date());
//    }
//
//    @Before
//    public  void forEachTestCases() {
//        System.out.println("Before Each Test cases ");
//    }
//    @After
//    public  void afterEachTestCases() {
//        System.out.println("After Each Test cases ");
//    }
//
//
//    @Test(timeout = 4000)
//    public void addTwoNumberTest() {
//        try{
//        Thread.sleep(3000);}
//        catch (Exception e){}
//        int result = Calculator.addTwoNumber(10, 20);
//        int expectedResult = 30;
//        Assert.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    public void subTwoNumberTest() {
//        int result = Calculator.subTwoNumber(20, 10);
//        int expectedResult = 10;
//        Assert.assertEquals(result, expectedResult);
//    }
//
//@Test
//    public void multTwoNumberTest() {
//         int result =Calculator.multTwoNumber(20 ,20);
//
//         int expectedResult =400 ;
//
//         Assert .assertEquals(result ,expectedResult);
//    }
//
//    @Test
//    public void addAnyNumberTest (){
//        int result = Calculator .addAnyNumber(10,20,30);
//
//        int expectedResult = 60 ;
//
//        Assert.assertEquals(result ,expectedResult);
//    }
//
//    @AfterClass
//    public static void cleanUp() {
//        System.out.println("All files closed " + new Date());
//    }
//}