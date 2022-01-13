package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1And2And3And4Then4() {
        Max max4 = new Max();
        int result = max4.max(1, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2And5Then10() {
        Max max5 = new Max();
        int result = max5.max(1, 2, 10);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11And2() {
        Max max11 = new Max();
        int result = max11.max(11, 2);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And1And1And1Then1() {
        Max max1 = new Max();
        int result = max1.max(1, 1, 1, 1);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}