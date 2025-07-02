package org.example.Service;


import org.example.Services.CalculaterService;
import org.junit.*;
import org.junit.internal.RealSystem;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorServiceTest {


    @BeforeClass
    public static void init(){

        System.out.println("before all test cases: ");
        System.out.println("start testcase : ");
    }

    @Before
    public void setUp() {
        // Arrange: Setup resources before each test
        System.out.println("Setup completed.");
    }


    // test method of add two numbers
    @Test
    public void addTwoNumbersTest(){

        System.out.println("add two number testcase ");
        int result = CalculaterService.addTwoNumbers(12 , 45);
        int expected = 57  ;
        Assert.assertEquals(expected , result);

    }
    // test method for sunAnyNumbers
    @Test
    public  void sumAnyNumbersTest(){
        // Arrange
        System.out.println("add two number testcase ");
        int expected = 29 ;
        // Act
        int result = CalculaterService.sumAnyNumber(12,2,4,5,6);
        // Assert
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testAddWithZero() {
        // Arrange
        System.out.println("add two number testcase ");
        int a = 0 ;
        int b= 7 ;

        // Act
        int result = CalculaterService.addTwoNumbers(a, b);

        // Assert
        Assert.assertEquals(7, result);
    }

    @AfterClass
    public static void cleanup(){

        System.out.println("ending of Testcases ; ");
    }
}
