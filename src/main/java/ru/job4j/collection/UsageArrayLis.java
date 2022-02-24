package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayLis {

    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (int i = 0; i < names.size(); i++) {
            Object value = names.get(i);
            System.out.println(value);
        }
    }
}

