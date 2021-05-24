package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2) {
        return (x2 - x1);

    }

    public static double distance1(int y1, int y2) {
        return (y2 - y1);
    }

    public static void main(String[] args) {
        double result = Math.sqrt((Math.pow(Point.distance(0, 0), 2)) + Math.pow(Point.distance1(2, 0), 2));
        System.out.println("Result (0,0) to (2,0) = " + result);
    }

}
