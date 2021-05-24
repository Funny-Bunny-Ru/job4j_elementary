package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point1Test {

    @Test
    public void whenOOTo20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point1.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To80Then8() {
        int x3 = 0;
        int y3 = 0;
        int x4 = 8;
        int y4 = 0;
        int expected1 = 8;
        double out1 = Point1.distance(x3, x4, y3, y4);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void when00To50Then5() {
        int x5 = 0;
        int y5 = 0;
        int x6 = 5;
        int y6 = 0;
        int expected2 = 5;
        double out2 = Point1.distance(x5, x6, y5, y6);
        Assert.assertEquals(expected2, out2, 0.01);
    }

}