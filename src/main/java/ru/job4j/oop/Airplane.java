package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moves through the air");
    }

    @Override
    public void refueling() {
        System.out.println(", 15 тонн топлива");
    }
}
