package model;

import java.io.Serializable;

public class CounterAnimals implements AutoCloseable, Serializable {
    private int count;
    CounterAnimals () {
        this.count = 0;
    }
    @Override
    public void close() throws Exception {
    }

    public void add() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
