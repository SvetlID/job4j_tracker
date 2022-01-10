package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String word = "helarious";
        return word;
    }

    public static void main(String[] args) {
        DummyDic happy = new DummyDic();
        String eng = happy.engToRus();
        System.out.println("Веселый" + eng);

    }
}
