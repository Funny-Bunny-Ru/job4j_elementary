package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class SqArea1Test {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double exp = 2;
        double out = SqArea1.square(p, k);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void whenP8K2Square3() {
        int p1 = 8;
        int k1 = 2;
        double exp1 = 2;
        double out1 = SqArea1.square(p1, k1);
        Assert.assertEquals(exp1, out1, 0.01);
    }

    @Test
    public void whenP28K4Square16() {
        int p2 = 28;
        int k2 = 4;
        double exp2 = 16;
        double out2 = SqArea1.square(p2, k2);
        Assert.assertEquals(exp2, out2, 0.01);
    }
}