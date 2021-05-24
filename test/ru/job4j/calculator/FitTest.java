package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double exp = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in1 = 170;
        double exp1 = 69;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(exp1, out1, 0.01);
    }
}