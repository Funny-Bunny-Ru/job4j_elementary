package ru.job4j.exercises;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        int dayhour = 8;
        int hourtax = 10;
        int overhourtax = 15;
        for (int i = 0; i < hours.length; i++) {
            if (i <= 4) {
                salary = hours[i] <= dayhour ? salary + hours[i] * hourtax : salary + (hours[i] - dayhour) * overhourtax + dayhour * hourtax;
            } else {
                salary = hours[i] <= dayhour ? salary + hours[i] * hourtax * 2 : salary + ((hours[i] - dayhour) * overhourtax + dayhour * hourtax) * 2;
            }

        }
        return salary;
    }
}
