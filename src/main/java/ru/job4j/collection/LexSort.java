package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] elementsL = left.split("\\.");
        String[] elementsR = right.split("\\.");
        return Integer.compare(Integer.parseInt(elementsL[0]), Integer.parseInt(elementsR[0]));
    }
}
