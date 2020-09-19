package com.heading.app.examples.calculator;

public class Calculator {

    public int memory; //Variable de Instancia
    public static int instances = 0; //Variable de clase

    public Calculator(){
        Calculator.instances++;
    }

//    public void sum(){
//        System.out.println("Sum is: " + (num1 + num2));
//    }

    public static void sum(int num1, int num2){
        System.out.println("Sum is: " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3){
        System.out.println("Sum is: " + (num1 + num2 + num3));
    }

    public static void sum(int num1, int num2, double num3){
        System.out.println("Sum is: " + (num1 + num2 + num3));
    }

    public static void sum(String num1, String num2){
        System.out.println("Sum is: " + (num1 + num2)); //TODO: Fix that
    }

    public static void subtract(int num1, int num2){
        System.out.println("Subtract is: " + (num1 - num2));
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    //TODO: Add division

    public void sumMemory(int num){ //Método que no debería ser estático
        memory += num;
    }
}
