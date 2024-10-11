package model;

public class CounterAnimals implements AutoCloseable{
    private int count;
    public CounterAnimals () {
        this.count = 0;
    }
    @Override
    public void close() throws Exception {

    }

    public void add() {
        this.count++;
    }
}
