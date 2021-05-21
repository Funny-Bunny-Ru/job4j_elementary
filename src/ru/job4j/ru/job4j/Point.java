package ru.job4j.ru.job4j;

public class Point {
    public static double distance(int x1, int x2) {
        return(x2 - x1);
    }
    public static double distance1(int y1, int y2) {
        return(y2 - y1);
    }
    public static void main(String[] args) {
        double result1 = Point.distance(0, 0);
        double result2 = Point.distance1(2,0);
        double result3 = Math.pow(result1, 2);
        double result4 = Math.pow(result2, 2);
        double result5 = result3 + result4;
        double result6 = Math.sqrt(result5);
        System.out.println("Result (0,0) to (2,0) = " + result6);
    }

}
