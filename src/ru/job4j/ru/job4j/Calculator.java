package ru.job4j.ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six / two;
        System.out.println(sixDivTwo);
        int fiveMinusTwo = five - two;
        System.out.println(fiveMinusTwo);
        int fourTimeTwo = four * two;
        System.out.println(fourTimeTwo);
        System.out.println("Результат расчета равен: " + sumAndTime(10, 20));
        System.out.println("Результат расчета разность плюс деление равен: " + sumAndDiv(10, 20));
        System.out.println("Результат сложения всех действий: " + sumAll(10, 20));
    }

    public static double sumAndTime(double first, double second) {
        return sumNumbers(first, second) + timeNumbers(first, second);
    }

    public static double sumAndDiv(double first, double second) {
        return difNumbers(first, second) + divNumber(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumNumbers(first, second) + timeNumbers(first, second) + difNumbers(first, second) + divNumber(first, second);
    }
}
