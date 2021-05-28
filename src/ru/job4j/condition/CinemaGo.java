package ru.job4j.condition;

public class CinemaGo {

    public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }

    }

    public static void main(String[] agrgs) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
