package ru.mts.domain.pet;

import java.math.BigDecimal;

public class Dog extends Pet {
    public Dog(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
