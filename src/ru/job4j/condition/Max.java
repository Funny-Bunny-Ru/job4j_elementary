package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int rsl = Max.max(10, 6);
        System.out.println(rsl);
    }
}
