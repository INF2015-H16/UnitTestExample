package unittestexemple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zzaier
 */
public class Calculator {

    public static int add(String firstValue, String secondValue) {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        return value1 + value2;
    }

    public static int substract(String firstValue, String secondValue) {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        return value1 - value2;
    }

    public static int multiply(String firstValue, String secondValue) {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        return value1 * value2;
    }

    public static int remainder(String firstValue, String secondValue) {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        return value1 % value2;
    }

    public static double divide(String firstValue, String secondValue) {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        return (double) value1 / (double) value2;
    }

    public static int power(String firstValue, String secondValue) throws InterruptedException {

        int value1 = Integer.parseInt(firstValue);

        int value2 = Integer.parseInt(secondValue);

        int result = value1;

        for (int i = 0; i < value2; i++) {
            result = result * value1;
            Thread.sleep(10);
        }
        return result;
    }

    public static double distance(Point point1, Point point2) {

        double distance = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));

        return distance;
    }

}
