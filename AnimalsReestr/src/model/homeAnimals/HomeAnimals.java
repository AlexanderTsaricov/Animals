package model.homeAnimals;

import model.Animal;
import model.AnimalReestr;
import model.CounterAnimals;
import model.enumPack.Sex;

import java.util.Date;

public class HomeAnimals extends Animal {
    String voice;

    public HomeAnimals(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String voice) {
        super(name, birthday, sex, command, reestr, counter);
        this.voice = voice;
    }
}
