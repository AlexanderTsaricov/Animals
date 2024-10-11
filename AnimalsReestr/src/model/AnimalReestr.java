package model;

import model.homeAnimals.Cat;
import model.homeAnimals.Dog;
import model.homeAnimals.Hamster;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalReestr {
    int animalCounter;
    ArrayList<Animal> animalCollection;
    public AnimalReestr() throws IOException {
        this.animalCounter = 0;
        this.animalCollection = new ArrayList<>();
    }
    public void add () throws IOException {
        this.animalCounter++;
    }
    public void addHomeAnimal (
            String name,
            Date birthday,
            Sex sex,
            String command,
            AnimalReestr reestr,
            String voise,
            CategoryHomeAnimal category) {
        switch (category){
            case Cat:
                animalCollection.add(new Cat(name, birthday, sex,command, reestr, voise));
                break;
            case Dog:
                animalCollection.add(new Dog(name, birthday, sex,command, reestr, voise));
                break;
            case Hamster:
                animalCollection.add(new Hamster(name, birthday, sex,command, reestr, voise));
                break;
        }
    }
}
