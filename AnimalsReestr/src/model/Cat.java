package model;

import model.enumPack.Sex;

import java.util.Date;

public class Cat extends HomeAnimals {
    Cat(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String voise) {
        super(name, birthday, sex, command, reestr, counter, voise);
    }
}
