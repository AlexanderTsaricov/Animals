package model;

import model.homeAnimals.Cat;
import model.homeAnimals.Dog;
import model.homeAnimals.Hamster;
import model.packAnimal.Camel;
import model.packAnimal.Donkey;
import model.packAnimal.Horse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

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
        String voise,
        CategoryHomeAnimal category) {
        switch (category){
            case Cat:
                animalCollection.add(new Cat(name, birthday, sex,command, this, voise));
                break;
            case Dog:
                animalCollection.add(new Dog(name, birthday, sex,command, this, voise));
                break;
            case Hamster:
                animalCollection.add(new Hamster(name, birthday, sex,command, this, voise));
                break;
        }
    }
    public void addPackAnimal (
       String name,
       Date birthday,
       Sex sex,
       String command,
       String bag,
       CategoryPackAnimal category
    ) {
        switch (category) {
            case Horse:
                animalCollection.add(new Horse(name, birthday, sex, command, this, bag));
                break;
            case Donkey:
                animalCollection.add(new Donkey(name, birthday, sex, command, this, bag));
                break;
            case Camel:
                animalCollection.add(new Camel(name, birthday, sex, command, this, bag));
                break;
        }
    }
}
