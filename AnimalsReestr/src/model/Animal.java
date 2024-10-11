package model;

import java.io.IOException;
import java.util.Date;

public class Animal {
    private String name;
    private Date birthday;
    private Sex sex;
    private String command;
    /*
    * Я бы лучше оставил один этот класс и просто добавил сюда тип и категорию, но так как
    * по заданию нужно реализовать наследование по диаграмме, сделаю как в задании
    * */
    public Animal (String name, Date birthday, Sex sex, String command, AnimalReestr reestr) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.command = command;
        try {
            reestr.add();
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
        return command;
    }
}
