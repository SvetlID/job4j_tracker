package ru.job4j.tracker;

public interface Transport {
    void drive();

    void passengers(int number);

    int fill(int liter);
}
