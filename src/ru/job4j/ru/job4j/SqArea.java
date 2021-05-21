package ru.job4j.ru.job4j;

public class SqArea {
    public static double square (int p, int k) {
        // L=H*K
        // S=L*H = H*K*H
        // H=P/(2*(K+1))
        // S = (P/(2*(K+1))^2*K
        return(Math.pow(p/(2*(k+1)), 2) * k);
    }
    public static void main(String[] args){
        double result = SqArea.square(4, 1);
        System.out.println("P=4, K=1, S=1, real = " + result);
    }
}
