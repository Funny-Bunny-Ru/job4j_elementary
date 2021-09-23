package ru.job4j.exercises;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GreatThenTest {

    @Test
    public void whenFirstLess() {
        assertThat(
                GreatThen.check(1, 2), is(false));
    }

    @Test
    public void whenFirstGreat() {
        assertThat(GreatThen.check(10 , 2), is(true) );
    }

}