package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " moves on rails");
    }

    @Override
    public void refueling() {
        System.out.println(", 8000 литров топлива");
    }
}
