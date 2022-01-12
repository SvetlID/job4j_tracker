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

    public int sumAllOperation() {
        return sum(5) + multiply(5) + minus(5) + divide(10);
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
        int resSumAll = calculatorAll.sumAllOperation();
        System.out.println(resSumAll);
    }
}
