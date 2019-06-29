package com.example.test;

import java.util.ArrayList;

public class ArraySort {

    public int[] intListToSort(int[] listToSort) {

        int numToSort = 0;

    for (int i = 0; i < listToSort.length -1; i++) {
        for(int j =0; j < listToSort.length - i -1; j++) {
            if (listToSort[j] > listToSort[j + 1]) {
                numToSort = listToSort[j];
                listToSort[j] = listToSort[j + 1];
                listToSort[j + 1] = numToSort;
            }
        }

}
        return listToSort;
    }

    public static void main(String[] args) {

        int[] array = new int[]{2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
        ArraySort arraySort = new ArraySort();

        arraySort.intListToSort(array);

        for (int i = 0; i < array.length -1;i++){
            System.out.println(array[i]);

        }


    }


}
