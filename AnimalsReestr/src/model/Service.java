package model;

import model.enumPack.CategoryHomeAnimal;
import model.enumPack.CategoryPackAnimal;
import model.enumPack.Sex;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Service {
    private AnimalReestr animalReestr;
    CounterAnimals counter;
    public Service () throws IOException {
        this.animalReestr = new AnimalReestr();
        this.animalReestr = animalReestr.load();

        this.counter = new CounterAnimals();
    }

    public void addAnimal(String name, String dateStr, Sex sex, String command, String voice, CategoryHomeAnimal category){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            Date date = (Date) formatter.parse(dateStr);
            System.out.println("Преобразованная дата: " + date);
            animalReestr.addHomeAnimal(name, date, sex, command, voice, counter, category);
            animalReestr.save();
    }

    public void addAnimal(String name, String dateStr, Sex sex, String command, String bag, CategoryPackAnimal category){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Date date = (Date) formatter.parse(dateStr);
        System.out.println("Преобразованная дата: " + date);
        animalReestr.addPackAnimal(name, date, sex, command, counter, bag, category);
        animalReestr.save();
    }

    public void addCommandToAnimal (String comand, int numberAnimal) {
        animalReestr.animalCollection.get(numberAnimal-1).addCommand(comand);
        animalReestr.save();
    }

    public ArrayList<Animal> showAllAnimal () {
        return animalReestr.animalCollection;
    }

    public ArrayList<String> showAllComand (int numberAnimal) {
        ArrayList<String> listCommand = animalReestr.animalCollection.get(numberAnimal-1).getListcommand();
        return listCommand;
    }

    public String extendAnimalCommand (int numberAnimal, int numberCommand) {
        return animalReestr.animalCollection.get(numberAnimal-1).getListcommand().get(numberCommand);
    }
}
