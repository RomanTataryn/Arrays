package com.company;

public class sum {
    public static void main(String[] args) {
        double array2[] = {-2.5, 10.01, -7.051, 44.1, 1057};
        Suma(array2);
    }

    public static double Suma(double[] array2) {
        double Sum = 0.0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0) {
                Sum += array2[i];
            }
        }
        System.out.println("сума додатніх чисел масиву: " + Sum);
        return Sum;

    }
}
