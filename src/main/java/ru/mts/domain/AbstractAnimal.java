package ru.mts.domain;

import java.math.BigDecimal;

public abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

    public AbstractAnimal(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", cost=" + getCost().toString() +
                ", character='" + getCharacter() + '\'' +
                '}';
    }
}
