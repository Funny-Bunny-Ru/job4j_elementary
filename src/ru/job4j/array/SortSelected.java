package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMix(data, i, data.length - 1);
            int index = FindLoop.indexOf1(data, min, i, data.length - 1);
            SwitchArray.swap(data, data[index], data[i]);
        }
        return data;
    }
}
