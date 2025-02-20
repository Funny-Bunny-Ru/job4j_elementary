package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minimum = MinDiapason.findMix(data, i, data.length - 1);
            int index = FindLoop.indexOf1(data, minimum, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
