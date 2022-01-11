package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Веселый " + eng;
    }

    public static void main(String[] args) {
        DummyDic happy = new DummyDic();
        System.out.println(happy.engToRus("helarious"));
    }
}
