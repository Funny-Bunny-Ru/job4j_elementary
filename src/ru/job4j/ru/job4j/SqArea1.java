package ru.job4j.ru.job4j;

public class SqArea1 {
    // h = p/(2*(k+1))
    // L=H*K
    // S = L*h
    public static double square (int p, int k) {
        return (p / (2 * (k + 1)));
    }
    public static void main(String[] args){
        double resulth = SqArea1.square(4, 1);
        double resultl = resulth * k;
        double results = resulth * resultl;
        System.out.println("P=4, K=1, S=1, real = " + results);
    }
}
