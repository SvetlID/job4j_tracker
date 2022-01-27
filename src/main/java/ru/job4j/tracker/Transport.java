package ru.job4j.tracker;

public interface Transport {
    String drive();

    int passengers(int number);

    int fill(int liter);
}
