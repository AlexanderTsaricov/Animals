package model;

import model.enumPack.CategoryHomeAnimal;
import model.enumPack.CategoryPackAnimal;
import model.enumPack.Sex;
import model.homeAnimals.Cat;
import model.homeAnimals.Dog;
import model.homeAnimals.Hamster;
import model.packAnimal.Camel;
import model.packAnimal.Donkey;
import model.packAnimal.Horse;
import model.saveReestr.Saving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class AnimalReestr {
    ArrayList<Animal> animalCollection;
    public AnimalReestr() throws IOException {
        this.animalCollection = new ArrayList<>();
    }
    public void addHomeAnimal (
        String name,
        Date birthday,
        Sex sex,
        String command,
        String voise,
        CounterAnimals counter,
        CategoryHomeAnimal category) {
        switch (category){
            case Cat:
                animalCollection.add(new Cat(name, birthday, sex,command, this, counter, voise));
                break;
            case Dog:
                animalCollection.add(new Dog(name, birthday, sex,command, this, counter, voise));
                break;
            case Hamster:
                animalCollection.add(new Hamster(name, birthday, sex,command, this, counter, voise));
                break;
        }
    }
    public void addPackAnimal (
       String name,
       Date birthday,
       Sex sex,
       String command,
       CounterAnimals counter,
       String bag,
       CategoryPackAnimal category
    ) {
        switch (category) {
            case Horse:
                animalCollection.add(new Horse(name, birthday, sex, command, this, counter,bag));
                break;
            case Donkey:
                animalCollection.add(new Donkey(name, birthday, sex, command, this, counter, bag));
                break;
            case Camel:
                animalCollection.add(new Camel(name, birthday, sex, command, this, counter, bag));
                break;
        }
    }
    public void save() {
        try {
            Saving save = new Saving();
            save.save(this);
        } catch (IOException e) {
            System.out.println(e.getMessage() + "Реестр не сохранен");
        }
    }
    public AnimalReestr load() throws IOException {
        try {
            Saving load = new Saving();
            return load.load();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "Реестр не загружен");
            return new AnimalReestr();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return new AnimalReestr();
        }
    }
}
