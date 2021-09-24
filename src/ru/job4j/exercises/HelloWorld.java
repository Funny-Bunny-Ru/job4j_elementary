package ru.job4j.exercises;

public class HelloWorld {
    public static String checkNumber(int number) {
        String rsl = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            rsl = "Hello, World!!!";
        } else if (number % 3 == 0) {
            rsl = "Hello";
        } else if (number % 5 == 0) {
            rsl = "World";
        }
        return rsl;
    }
}
