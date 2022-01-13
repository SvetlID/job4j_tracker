package ru.job4j.oop;

import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;


import org.junit.Test;

public class TriangleTest {

    @Test
    public void area8() {
        double expected = 8;
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void area40dot5() {
        double expected = 40.5;
        Point a = new Point(1, 1);
        Point b = new Point(1, 10);
        Point c = new Point(10, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void area2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(1, 3);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void areaMinus1() {
        double expected = -1;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.01);
    }
}