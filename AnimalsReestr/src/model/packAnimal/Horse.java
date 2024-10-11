package model.packAnimal;

import model.AnimalReestr;
import model.Sex;

import java.util.Date;

public class Horse extends PackAnimal{
    public Horse(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, String bag) {
        super(name, birthday, sex, command, reestr, bag);
    }
}
