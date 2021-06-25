package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int minimum = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < minimum) {
                minimum = array[index];
            }
        }
        return minimum;
    }
}
