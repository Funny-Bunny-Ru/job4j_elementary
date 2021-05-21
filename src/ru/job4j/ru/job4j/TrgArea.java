package ru.job4j.ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        // p = (a+b+c)/2
        // p-a = (a+b+c)/2-a = (b+c-a)/2
        // p-b = (a+b+c)/2-b = (a+c-b)/2
        // p-c = (a+b+c)/2-c = (a+b-c)/2
        //S = ((a+b+c)/2)*((b+c-a)/2)*((a+c-b)/2)*((a+b-c)/2) = Sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)/8)
        return(Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)/8));
    }
    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("Area (2, 2, 2,) = " + result);
    }
}
