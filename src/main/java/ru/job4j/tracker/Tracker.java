package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByName(String key) {
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                return findByName(key);
            }
        }
        return findByName(key);
    }

    public Item[] findAll() {
        size = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }

        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        for (int index = 0; index < items.length; index++) {
            System.out.println(itemsWithoutNull[index]);
        }
        return itemsWithoutNull;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
