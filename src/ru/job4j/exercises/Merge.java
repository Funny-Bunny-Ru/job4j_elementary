package ru.job4j.exercises;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int i = 0; i < right.length; i++) {
            rsl[count++] = right[i];
        }
        for (int i = 0; i < rsl.length - 1; i++) {
            if (rsl[i] >= rsl[i + 1]) {
                int tmp = rsl[i];
                rsl[i] = rsl[i + 1];
                rsl[i + 1] = tmp;
            }
        }
        return rsl;
    }
}

