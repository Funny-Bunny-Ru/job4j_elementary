package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class XCalcTest {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int exp = 40;
        int rsl = XCalc.calc(a, b, c, x);
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void wgenA1B1C1X1Then3() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int exp1 = 3;
        int rsl1 = XCalc.calc(a1, b1, c1, x1);
        Assert.assertEquals(exp1, rsl1);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int exp2 = 2;
        int rsl2 = XCalc.calc(a2, b2, c2, x2);
        Assert.assertEquals(exp2, rsl2);
    }

    @Test
    public void wHenA1B1C0X1Then2() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int exp3 = 2;
        int rsl3 = XCalc.calc(a3, b3, c3, x3);
        Assert.assertEquals(exp3, rsl3);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int exp4 = 1;
        int rsl4 = XCalc.calc(a4, b4, c4, x4);
        Assert.assertEquals(exp4, rsl4);
    }
}