package model;

import model.enumPack.CategoryHomeAnimal;
import model.enumPack.CategoryPackAnimal;
import model.enumPack.Sex;

import java.io.IOException;
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
            String[] dateArrStr = dateStr.split("-");
            Date date = new Date(Integer.parseInt(dateArrStr[0]), Integer.parseInt(dateArrStr[1]), Integer.parseInt(dateArrStr[2]));
            animalReestr.addHomeAnimal(name, date, sex, command, voice, counter, category);
            animalReestr.save();
    }

    public void addAnimal(String name, String dateStr, Sex sex, String command, String bag, CategoryPackAnimal category){
        String[] dateArrStr = dateStr.split("-");
        Date date = new Date(Integer.parseInt(dateArrStr[0]), Integer.parseInt(dateArrStr[1]), Integer.parseInt(dateArrStr[2]));
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
        return animalReestr.animalCollection.get(numberAnimal).getListcommand().get(numberCommand);
    }

    public Animal getAnimal (int index) {
        return animalReestr.animalCollection.get(index-1);
    }
    public int getCountAnimals (){
        return animalReestr.getCounterAnimals();
    }
}
