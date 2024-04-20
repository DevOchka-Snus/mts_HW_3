package ru.mts.service.impl;

import ru.mts.domain.AbstractAnimal;
import ru.mts.domain.pet.Cat;
import ru.mts.domain.pet.Dog;
import ru.mts.domain.predator.Lion;
import ru.mts.domain.predator.Wolf;
import ru.mts.service.CreateAnimalService;

import java.math.BigDecimal;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public void createAnimals(int N) {
        AbstractAnimal animal;
        var cost = new BigDecimal("100");
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (i < 5) {
                    animal = new Lion("lion " + i,
                            "Vanomas " + i,
                            cost.add(new BigDecimal(100)),
                            "character " + i);
                } else {
                    animal = new Wolf("wolf " + i,
                            "Kuplinov " + i,
                            cost.add(new BigDecimal(i)),
                            "character " + i);
                }
            } else {
                if (i % 3 == 0) {
                    animal = new Dog("dog " + i,
                            "Mops " + i,
                            cost.add(new BigDecimal(100)),
                            "character " + i);
                } else {
                    animal = new Cat("cat " + i,
                            "Leopold " + i,
                            cost.add(new BigDecimal(i)),
                            "character " + i);
                }
            }
            System.out.println(animal);
        }
    }

    @Override
    public void createAnimals() {
        CreateAnimalService.super.createAnimals();
        System.out.println();
        AbstractAnimal animal;
        int counter = 0;
        var cost = new BigDecimal("100");
        do {
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
        } while (counter < 10);
    }
}
