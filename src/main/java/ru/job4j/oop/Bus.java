package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moves on highways");
    }

    @Override
    public void refueling() {
        System.out.println(", 200 литров топлива");
    }
}
