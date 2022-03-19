package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void sortByNames() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Anton")
        );

        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Anton"),
                new Item("Ivan"),
                new Item("Petr")
        );
        assertThat(items, is(expected));
    }
}
