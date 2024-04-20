package ru.mts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        calculate(new Calculator(10, new BigDecimal("3.23"), new BigDecimal("0.75")));
        calculate(new Calculator(34, new BigDecimal("14.88"), new BigDecimal("42.575")));
        calculate(new Calculator(16, new BigDecimal("4.67"), new BigDecimal("59.1")));
    }
    private static void calculate(Calculator calculator) {
        var amount = new BigDecimal(calculator.amount);
        var result = calculator.price.multiply(amount);
        System.out.println(result.setScale(2, RoundingMode.HALF_UP));
        var hundred = new BigDecimal(100);
        result = result.multiply(hundred).subtract(result.multiply(calculator.discount));
        System.out.println(result.divide(hundred, RoundingMode.HALF_EVEN).setScale(2, RoundingMode.HALF_UP));
    }
}