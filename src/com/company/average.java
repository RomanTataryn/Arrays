package com.company;

import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        int Array[] = new int[5];
        int k = 0;                // k-кількість елементів масиву
        double Sum = 0, SA = 0;   // Sum- сума елементів масиву, SA- середнє арифметичне
        Scanner Scan = new Scanner(System.in);
        System.out.println("введіть 5 елементів масиву");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Scan.nextInt();
            Sum += Array[i];
            k++;
        }
        SA = Sum / k;

        System.out.println("сума чисел: " + Sum);
        System.out.println("кількість елементів масиву: " + k);
        System.out.println("середнє арифметичне введеного масиву чисел: " + SA);


    }
}
