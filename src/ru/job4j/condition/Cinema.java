package ru.job4j.condition;

public class Cinema {

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }

    public static void access(int age) {
        if (age >= 21) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }
}
