package ru.mts.domain;

import java.math.BigDecimal;

/**
 * The Animal interface contains methods
            * that return the values of the corresponding fields in the AbstractAnimal class
 * @version 1.0 17 December 2023
 * @author vladi
 *  */
public interface Animal {
    /* @return the value of the breed field */
    String getBreed();

    /* @return the value of the name field */
    String getName();

    /* @return the value of the cost field */
    BigDecimal getCost();

    /* @return the value of the character field */
    String getCharacter();
}
