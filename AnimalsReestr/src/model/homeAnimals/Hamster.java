package model.homeAnimals;

import model.AnimalReestr;
import model.Sex;

import java.util.Date;

public class Hamster extends HomeAnimals{
    public Hamster(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, String voise) {
        super(name, birthday, sex, command, reestr, voise);
    }
}
