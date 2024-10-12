package model.saveReestr;

import model.AnimalReestr;

import java.io.*;

public class Saving implements SaveAndLoad {
    @Override
    public void save(AnimalReestr obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/model/saveReestr/save.json"));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();

    }

    @Override
    public AnimalReestr load() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/model/saveReestr/save.json"));
        AnimalReestr loadObj = (AnimalReestr) objectInputStream.readObject();
        objectInputStream.close();
        return loadObj;
    }
}
