package com.example.testandDocker.TestAndDockerHub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private static CalculatorService calculatorService ;

    @BeforeAll
    public static void init() {
        calculatorService = new CalculatorService();
    }
    @Test
    public void testAdd() {

        Assertions.assertEquals(8, calculatorService.add(5, 3));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(2, calculatorService.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(15, calculatorService.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculatorService.divide(6, 3));
    }

    @Test
    public void testPower() {
        Assertions.assertEquals(8, calculatorService.power(2, 3));
    }

    @Test
    public void testFactorial() {
        Assertions.assertEquals(120, calculatorService.factorial(5));
    }

    @Test
    public void testGcd() {
        Assertions.assertEquals(6, calculatorService.gcd(12, 18));
    }

    @Test
    public void testLcm() {
        Assertions.assertEquals(36, calculatorService.lcm(12, 18));
    }

    @Test
    public void testSqrt() {
        Assertions.assertEquals(4, calculatorService.sqrt(16));
    }
    @Test
    public void testFactorialNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.factorial(-5));
    }
    @Test
    public void testSqrtNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.sqrt(-9));
    }
    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(6, 0));
    }
}
