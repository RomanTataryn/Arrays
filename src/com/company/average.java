package com.company;

import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        int array[] = new int[5];
        int k = 0;                // k-кількість елементів масиву
        double sum = 0, sa = 0;   // sum- сума елементів масиву, sa- середнє арифметичне
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть 5 елементів масиву");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
            k++;
        }
        sa = sum / k;

        System.out.println("сума чисел: " + sum);
        System.out.println("кількість елементів масиву: " + k);
        System.out.println("середнє арифметичне введеного масиву чисел: " + sa);


    }
}
