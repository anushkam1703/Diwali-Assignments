package com.demo.study;


public class Calculator {

    public static int calculate(int num1, int num2, String operator) throws WrongOperatorException {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    throw new ArithmeticException("Division by zero not allowed!");
                return num1 / num2;
            case "%":
                if (num2 == 0)
                    throw new ArithmeticException("Modulo by zero not allowed!");
                return num1 % num2;
            default:
                throw new WrongOperatorException("Invalid operator: " + operator);
        }
    }
}
