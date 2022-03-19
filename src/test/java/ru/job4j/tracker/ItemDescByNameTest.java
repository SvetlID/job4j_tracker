package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemDescByNameTest {

    @Test
    public void SortByNames() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Anton")
        );

        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Anton")
        );
        assertThat(items, is(expected));
    }
}