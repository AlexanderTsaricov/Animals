package model;

import model.enumPack.Sex;

import java.util.Date;

public class Horse extends PackAnimal{
    Horse(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String bag) {
        super(name, birthday, sex, command, reestr, counter, bag);
    }
}
