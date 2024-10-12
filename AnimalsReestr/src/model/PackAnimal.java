package model;

import model.enumPack.Sex;

import java.util.Date;

public class PackAnimal extends Animal {
    String bag;

    PackAnimal(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String bag) {
        super(name, birthday, sex, command, reestr, counter);
        this.bag = bag;
    }
}
