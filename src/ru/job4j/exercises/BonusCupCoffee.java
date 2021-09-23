package ru.job4j.exercises;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl = 0;
        if (count >= n) {
            rsl = count + count / n;
        }
        return rsl;
    }
}
