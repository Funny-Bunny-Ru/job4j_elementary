package ru.job4j.loop;

public class PrimeNumber {
    @SuppressWarnings("checkstyle:EmptyStatement")
    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
