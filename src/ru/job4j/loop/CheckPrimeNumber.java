package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int div = 2; div < number; div++) {
            if (number % div == 0) {
                System.out.println("It is not prime number.");
                break;
            } else {
                System.out.println("It is prime number.");
                break;
            }
        }
        return prime;
    }
}
