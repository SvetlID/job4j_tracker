package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int resMinus = minus(5);
        System.out.println(resMinus);
        Calculator calculatorDivide = new Calculator();
        int resDivide = calculatorDivide.divide(10);
        System.out.println(resDivide);
        Calculator calculatorAll = new Calculator();
        int resSumAll = calculatorAll.sumAllOperation(10);
        System.out.println(resSumAll);
    }
}
