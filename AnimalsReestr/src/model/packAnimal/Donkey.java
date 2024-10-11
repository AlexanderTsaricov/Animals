package model.packAnimal;

import model.AnimalReestr;
import model.CounterAnimals;
import model.enumPack.Sex;

import java.util.Date;

public class Donkey extends PackAnimal{
    public Donkey(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter, String bag) {
        super(name, birthday, sex, command, reestr, counter, bag);
    }
}
