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
        int count = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                itemsWithoutNull[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    public Item[] findAll() {
        int size = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (Item item : items) {
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean result = true;
        int index = indexOf(id);
        if (index == -1) {
            result = false;
        } else {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
}



