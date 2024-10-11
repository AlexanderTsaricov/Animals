package model.packAnimal;

import model.Animal;
import model.AnimalReestr;
import model.Sex;

import java.util.Date;

public class PackAnimal extends Animal {
    String bag;
    public PackAnimal(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, String bag) {
        super(name, birthday, sex, command, reestr);
        this.bag = bag;
    }
}
