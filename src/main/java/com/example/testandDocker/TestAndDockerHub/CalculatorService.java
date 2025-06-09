package com.example.testandDocker.TestAndDockerHub;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public int factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public int sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not real");
        }
        return (int) Math.sqrt(a);
    }
}
