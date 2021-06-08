package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int number = 0; number < rst.length; number++) {
            rst[number] = (int) Math.pow(number, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index : array) {
            System.out.println(index);
        }
    }
}
