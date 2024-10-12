package model;

import model.enumPack.Sex;

import java.util.Date;

public class HomeAnimals extends Animal {
    String voice;

    HomeAnimals(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String voice) {
        super(name, birthday, sex, command, reestr, counter);
        this.voice = voice;
    }
}
