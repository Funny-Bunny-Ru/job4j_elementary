package ru.job4j.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCheckTest {

    @Test
    public void check() {
        assertTrue(OddCheck.check(3));
        assertFalse(OddCheck.check(2));
    }
}