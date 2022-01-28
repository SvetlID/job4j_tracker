package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void drive() {
    }

    @Override
    public void passengers(int number) {
    }

    @Override
    public int fill(int liter) {
        int price = 50;
        return price * liter;
    }
}