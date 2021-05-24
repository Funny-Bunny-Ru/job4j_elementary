package ru.job4j.condition;

public class SqArea1 {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea1.square(4, 1);
        System.out.println("P=4, K=1, S=1, real = " + result);
    }
}
