package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to68then4dot12() {
        double expected = 4.12;
        Point a = new Point(5, 4);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to74then5dot39() {
        double expected = 5.39;
        Point a = new Point(2, 2);
        Point b = new Point(7, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
