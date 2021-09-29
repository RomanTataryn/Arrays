package com.company;

public class sort {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 7, 11};
        // System.out.print();
        Bubblesort(array);  // Метод сортування бульбашкою

    }

    public static void Bubblesort(int[] array) {

        boolean yezamina = true;
        int k = 0;
        while (yezamina) {
            yezamina = false;
            for (int i = 0; i < array.length - 1 - k; i++) {

                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    yezamina = true;
                }
            }
            k++;
        }
        for (int i : array)
            System.out.print(i + " ");

    }

}