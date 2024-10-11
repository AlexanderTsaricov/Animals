package model.homeAnimals;

import model.Animal;
import model.AnimalReestr;
import model.Sex;

import java.util.Date;

public class HomeAnimals extends Animal {
    String voise;
    public HomeAnimals(String name, Date birthday, Sex sex, String command, AnimalReestr reestr, String voise) {
        super(name, birthday, sex, command, reestr);
        this.voise = voise;
    }
}
