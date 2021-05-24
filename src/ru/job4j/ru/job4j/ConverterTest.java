package ru.job4j.ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        double expected = 2d;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0);

    }

    @Test
    public void whenConvert140RblThen2Dollars() {
        int in1 = 140;
        double expected1 = 2d;
        double out1 = Converter.rubleToDollar(in1);
        Assert.assertEquals(expected1, out1, 1);
    }

    @Test
    public void whenConvert140DlrThen1Euro() {
        int in2 = 140;
        double expected2 = 120d;
        double out2 = Converter.dollarToEuro(in2);
        Assert.assertEquals(expected2, out2, 0);
    }

    @Test
    public void whenConvert140EuThen9800Rbl() {
        int in3 = 140;
        double expected3 = 9800d;
        double out3 = Converter.euroToRuble(in3);
        Assert.assertEquals(expected3, out3, 0);
    }

    @Test
    public void whenConvert140DlrThen120Eu() {
        int in4 = 140;
        double expected4 = 120d;
        double out4 = Converter.dollarToEuro(in4);
        Assert.assertEquals(expected4, out4, 0);
    }

    @Test
    public void whenConvert140DlrThen8400Rbl() {
        int in5 = 140;
        double expected5 = 8400d;
        double out5 = Converter.dollarToRuble(in5);
        Assert.assertEquals(expected5, out5, 0);
    }
}