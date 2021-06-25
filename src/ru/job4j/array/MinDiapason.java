package ru.job4j.array;

public class MinDiapason {
    public static int findMix(int[] array, int start, int finish) {
        int minimum = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < minimum) {
                minimum = array[index];
            }
        }
        return minimum;
    }
}
