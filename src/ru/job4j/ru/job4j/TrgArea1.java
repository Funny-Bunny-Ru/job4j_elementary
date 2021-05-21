package ru.job4j.ru.job4j;

public class TrgArea1 {
    public static double area(double a, double b, double c) {
        double p = (a+b+c)/2;
        return(Math.sqrt((p*(p-a)*(p-b)*(p-c))));
    }
    public static void main(String[] args) {
        double result = TrgArea1.area(2, 2, 2);
        System.out.println("Area (2, 2, 2,) = " + result);
    }
}
