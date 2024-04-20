package ru.mts;

import ru.mts.service.impl.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimals(10);
        System.out.println();
        createAnimalService.createAnimals();
    }
}