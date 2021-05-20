package ru.job4j.ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }
    public static float euroToDollar(float value) {
        float rsl = value * 70 / 60;
        return rsl;
    }
    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }
    public static float dollarToEuro(float value) {
        float rsl = value * 60 / 70;
        return rsl;
    }
    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float dollar1 = Converter.euroToDollar(140);
        float ruble = Converter.euroToRuble(140);
        float euro1 = Converter.dollarToEuro(140);
        float ruble1 = Converter.dollarToRuble(140);
        System.out.println("140 rubles " + euro + " euro");
        System.out.println("140 rubles " + dollar + " dollars");
        System.out.println("140 euro " + dollar1 + " dollars");
        System.out.println("140 euro " + ruble + " rubles");
        System.out.println("140 dollars " + euro1 + " euro");
        System.out.println("140 dollars " + ruble1 + " rubles");

    }
}
