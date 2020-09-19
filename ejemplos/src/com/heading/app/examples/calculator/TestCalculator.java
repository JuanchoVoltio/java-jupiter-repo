package com.heading.app.examples.calculator;

public class TestCalculator {
    public static void main(String[] args){

        Calculator.sum(2, 7);
        Calculator myCalculator = new Calculator();
        myCalculator.memory = Calculator.multiply(3, 5);

        myCalculator.sumMemory(4);
        System.out.println("Memory: " + myCalculator.memory);

        Calculator otherCalculator = new Calculator();
        otherCalculator.memory = 8;

        int result;

        result = Calculator.multiply(2, 7);
        System.out.println("Multiply is: " + result);

        System.out.println("Calculator instances: " + Calculator.instances);
    }
}
