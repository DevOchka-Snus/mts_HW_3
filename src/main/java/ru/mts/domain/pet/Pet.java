package ru.mts.domain.pet;

import ru.mts.domain.AbstractAnimal;

import java.math.BigDecimal;

public abstract class Pet extends AbstractAnimal {
    public Pet(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }
}
