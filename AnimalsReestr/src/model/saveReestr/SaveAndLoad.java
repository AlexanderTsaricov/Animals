package model.saveReestr;

import model.AnimalReestr;

import java.io.IOException;

public interface SaveAndLoad {
    abstract void save(AnimalReestr obj) throws IOException;
    abstract public AnimalReestr load() throws IOException, ClassNotFoundException;
}
