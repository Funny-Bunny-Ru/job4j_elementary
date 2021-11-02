package ru.job4j.exercises;

public class AttackRook {
    public static boolean check(String left, String right) {
        return left.charAt(0) == right.charAt(0) || left.charAt((left.length() - 1)) == right.charAt((right.length() - 1));

    }
}
