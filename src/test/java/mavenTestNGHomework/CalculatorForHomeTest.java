package mavenTestNGHomework;

import org.testng.Assert;
import org.testng.annotations.*;
import practise.CalculatorForHome;

public class CalculatorForHomeTest {
    CalculatorForHome calculator;

    @BeforeSuite
    public void initCalculatorObject() {
        calculator = new CalculatorForHome();
    }

    @BeforeTest
    public void beforeCalculatorTest() {
        System.out.println("Calculator testing started");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Testing started");
    }

    @Test
    public void testAddMethod() {
        Assert.assertEquals(calculator.add(10, 20), 30);
    }

    @Test
    public void testSubtractMethod() {
        Assert.assertEquals(calculator.substract(20, 10), 10);
    }

    @Test
    public void testMultiplyMethod() {
        Assert.assertEquals(calculator.multiply(3, 6), 18);
    }

    @Test
    public void testDivideMethod() {
        Assert.assertEquals(calculator.divide(18, 3), 6);
    }

    @AfterMethod
    public void afterAddMethod() {
        System.out.println("Testing finished");
    }
}
