package ru.mts.service;

import ru.mts.domain.AbstractAnimal;
import ru.mts.domain.pet.Cat;
import ru.mts.domain.pet.Dog;
import ru.mts.domain.predator.Lion;
import ru.mts.domain.predator.Wolf;

import java.math.BigDecimal;

public interface CreateAnimalService {
    default void createAnimals() {
        AbstractAnimal animal;
        int counter = 0;
        var cost = new BigDecimal("100");
        while (counter < 10) {
            if (counter % 2 == 0) {
                if (counter < 5) {
                    animal = new Lion("lion " + counter,
                            "Vanomas " + counter,
                            cost.add(new BigDecimal(100)),
                            "character " + counter);
                } else {
                    animal = new Wolf("wolf " + counter,
                            "Kuplinov " + counter,
                            cost.add(new BigDecimal(counter)),
                            "character " + counter);
                }
            } else {
                if (counter % 3 == 0) {
                    animal = new Dog("dog " + counter,
                            "Mops " + counter,
                            cost.add(new BigDecimal(100)),
                            "character " + counter);
                } else {
                    animal = new Cat("cat " + counter,
                            "Leopold " + counter,
                            cost.add(new BigDecimal(counter)),
                            "character " + counter);
                }
            }
            System.out.println(animal);
            ++counter;
        }
    }
}
