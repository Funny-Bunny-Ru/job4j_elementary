package ru.job4j.ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println(name);
        System.out.println(name + age);
        System.out.println(age);
        System.out.println(name + name + name);
    }
    public static void main(String[] args) {
        String name = "Petr Arsentev ";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
