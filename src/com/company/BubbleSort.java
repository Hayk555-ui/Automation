package com.company;

public class BubbleSort {

    public void  bubbleSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        System.out.println("\nSorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
