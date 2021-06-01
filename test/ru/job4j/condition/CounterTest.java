package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenStart0Finish15Sum120() {
        int start = 0;
        int finish = 15;
        int result = Counter.sum(start, finish);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenStart5Finish17SumByEven66() {
        int start = 5;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 66;
        Assert.assertEquals(expected, result);
    }
}