package ru.job4j.exercises;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class BonusCupCoffeeTest {

    @Test
    public void countCup() {
        int rsl = BonusCupCoffee.countCup(7,6);
        assertThat(rsl, is(8));
    }

    @Test
    public void countCup1() {
        int rsl = BonusCupCoffee.countCup(213, 6);
        assertThat(rsl, is(248));
    }
}