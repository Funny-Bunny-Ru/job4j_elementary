package ru.job4j.exercises;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String message = "none";
        if (rsl == left + right) {
            message = "added";
        } else if (rsl == left - right) {
            message = "subtracted";
        } else if (rsl == left * right) {
            message = "multiplied";
        } else if (rsl == left / right) {
            message = "divided";
        }
        return message;
    }
}
