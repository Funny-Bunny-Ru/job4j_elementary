package ru.job4j.ru.job4j;

public class Converter {
      public static double rubleToEuro(double value) {
        return (value / 70);
    }

      public static double rubleToDollar(double value) {
        return (value / 60);
    }

      public static double euroToDollar(double value) {
        return (value * 70 / 60);
    }

      public static double euroToRuble(double value) {
        return (value * 70);
    }

      public static double dollarToEuro(double value) {
        return (value * 60 / 70);
    }

      public static double dollarToRuble(double value) {
        return (value * 60);
     }

     public static void main(String[] args) {
        int in = 140;
        double expected = 2d;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        int in1 = 2;
        double expected1 = 140d;
        double out1 = Converter.euroToRuble(in1);
        boolean passed1 = expected1 == out1;
        int in2 = 140;
        double expected2 = 9800d;
        double out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        int in3 = 140;
        double expected3 = 8400d;
        double out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        int in4 = 140;
        double expected4 = 2.3333332538604736;
        double out4 = Converter.rubleToDollar(in4);
        boolean passed4 = expected4 == out4;
        int in5 = 140;
        double expected5 = 163.33333333333334;
        double out5 = Converter.dollarToEuro(in5);
        boolean passed5 = expected5 == out5;
        int in6 = 140;
        double expected6 = 120;
        double out6 = Converter.dollarToEuro(in6);
        boolean passed6 = expected6 == out6;
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        double dollar1 = Converter.euroToDollar(140);
        double ruble = Converter.euroToRuble(140);
        double euro1 = Converter.dollarToEuro(140);
        double ruble1 = Converter.dollarToRuble(140);
        System.out.println("140 rubles " + euro + " euro");
        System.out.println("140 rubles " + dollar + " dollars");
        System.out.println("140 euro " + dollar1 + " dollars");
        System.out.println("140 euro " + ruble + " rubles");
        System.out.println("140 dollars " + euro1 + " euro");
        System.out.println("140 dollars " + ruble1 + " rubles");
        System.out.println("140 rubles are 2 euro. Test result: " + passed);
        System.out.println("2 euro are 140 rubles. Test result: " + passed1);
        System.out.println("140 euro are 9800 rubles. Test result: " + passed2);
        System.out.println("140 dollars are 8400 rubles. Test result: " + passed3);
        System.out.println("140 rubbles are 2,333 dollars. Test result: " + passed4);
        System.out.println("140 euro are 163,33 dollars. Test result: " + passed5);
        System.out.println("140 dollars are 120 euro. Test result: " + passed6);
    }
}
