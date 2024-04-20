package ru.mts;

import java.math.BigDecimal;

/**
 * Принимает в конструкторе 3 аргумента: amount (int), price (BigDecimal), discount(BigDecimal)
 * Аргументам соответствуют 3 публичный поля
 * */
public class Calculator {
    //Количество товара
    public int amount;
    //Цена за 1 единицу товара
    public BigDecimal price;
    // Размер скидки в процентах
    public BigDecimal discount;

    public Calculator(int amount, BigDecimal price, BigDecimal discount) {
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }
}