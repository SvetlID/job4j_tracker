package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("sdubrova@yandex.ru", " Svetlana Dubrova");
        map.remove("parsentev@yandex.ru");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("sdubrova@yandex.ru", " Svetlana Dubrova");
        map.remove("sdubrova@yandex.ru");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

}
