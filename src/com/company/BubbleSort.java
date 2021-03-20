package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(Arrays.toString(arr));
//        sort(arr);
        invertedSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] data) {
        /*
         почему barrier < data.length - 1 ? Потому что
                         data[index] = data[index + 1];
            здесь используется index + 1
         */
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }

        }
    }

    public static void invertedSort(int[] data) {
        /*
         почему barrier < data.length - 1 ? Потому что
                         data[index] = data[index + 1];
            здесь используется index + 1
         */
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier; index >= 0; index--) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }

        }
    }
}
