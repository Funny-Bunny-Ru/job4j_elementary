package ru.job4j.exercises;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        if (percent * prize > pay) {
            rsl = (int) (percent * prize - pay);
        }
        return rsl;
    }
}
