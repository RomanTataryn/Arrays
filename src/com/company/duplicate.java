package com.company;

public class duplicate {
    public static void main(String[] args) {
        int array[] ={3,2,3,1,4,2,8,3};
        for (int i=0; i<array.length;i++)
        { for (int j=0; j<array.length;j++)
            if (i!=j) {
                if (array[i] == array[j])  {
                    array[j]=0;
                }
            }

        }
        for (int i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
    }
}
