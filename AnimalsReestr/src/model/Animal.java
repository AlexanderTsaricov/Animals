package model;

import model.enumPack.Sex;

import java.util.ArrayList;
import java.util.Date;

public class Animal {
    private String name;
    private Date birthday;
    private Sex sex;
    private ArrayList<String> command;
    /*
    * Я бы лучше оставил один этот класс и просто добавил сюда тип и категорию, но так как
    * по заданию нужно реализовать наследование по диаграмме, сделаю как в задании
    * */
    public Animal (String name, Date birthday, Sex sex, String command, AnimalReestr reestr, CounterAnimals counter) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.command.add(command);
        try (counter){
            counter.add();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Resource 'counter animals' not closed");
        }
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday.toString();
    }

    public String getSex() {
        return sex.toString();
    }

    public String getCommand() {
        return command.toString();
    }

    public void addCommand (String command) {
        this.command.add(command);
    }

}
