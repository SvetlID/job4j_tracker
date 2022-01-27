package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int number) {
        return 0;
    }

    @Override
    public int fill(int liter) {
        int price = 50;
        return price * liter;
    }
}