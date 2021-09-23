package ru.job4j.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicAddTest {

    @Test
    public void check() {
        assertFalse(LogicAdd.check(-1));
        assertFalse(LogicAdd.check(1));
        assertTrue(LogicAdd.check(2));
    }
}