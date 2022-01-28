package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus drives");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Number of passengers: " + number);
    }

    @Override
    public int fill(int liter) {
        int price = 50;
        return price * liter;
    }
}