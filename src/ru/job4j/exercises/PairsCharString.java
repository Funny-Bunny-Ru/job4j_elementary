package ru.job4j.exercises;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return l.trim().isEmpty() && r.trim().isEmpty() || l.charAt(0) == r.charAt((r.length() - 1)) && r.charAt(0) == l.charAt((l.length() - 1));
    }
}
