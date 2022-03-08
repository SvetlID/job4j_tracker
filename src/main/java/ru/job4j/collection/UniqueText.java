package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateTest) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateTest.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String element1 : text) {
            if (!check.contains(element1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
