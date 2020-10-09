package com.company;

public class Calculator {
    private static int result;

    public int calculate(int num1, int num2,  char sigh) {
        switch(sigh) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '*':
                result = Math.multiplyExact(num1, num2);
                break;
            case '/':
                result = Math.floorDiv(num1, num2);
                break;
        }
        return result;
    }
}
