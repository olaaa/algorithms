package com.company;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[1_000];
        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(3000);
//        }
//        System.out.println(Arrays.toString(arr));
//        long t1 = System.nanoTime();
//        sort(arr);
//        System.out.println((System.nanoTime() - t1)/1_000);
//        System.out.println(Arrays.toString(arr));
//        arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(20);
//        }
        arr = new int[]{9, 6, 19, 6, 2};
        System.out.println(Arrays.toString(arr));
        long t2 = System.nanoTime();
        sortWithOnlyOneSwap(arr);
        System.out.println((System.nanoTime() - t2)/1_000);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * data.length - 1 потому что int index = barrier + 1.
     * barrier -- отделяет отсортированные от неотсортированных. Операции производяться срправа от границы
     */
    public static void sort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier + 1; index < data.length; index++) {
                final int min = data[barrier];
                if (min > data[index]) { // вынесла в переменную, так как не нужно лишний брать по индексу
                    int tmp = data[index];
                    data[index] = min; // вынесла в переменную, так как не нужно лишний брать по индексу
                    data[barrier] = tmp;
                }
            }

        }
    }

    /**
     * Избавляемся от обмена каждый раз, как находим меньшя барьерного, а запоминать индекс наименьшего..
     */
    public static void sortWithOnlyOneSwap(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            int leastIndex = barrier;
            for (int index = barrier + 1; index < data.length; index++) {
                if (data[leastIndex] > data[index]) {
                    leastIndex = index;
                    System.out.println(leastIndex);
                }
// по окончанию внутренней операции записываем в барьерную ячейку наименьшее значение, а в другую ячейку -- значение из баьерной
                if (index == data.length - 1) {
                    int tmp  = data[barrier];
                    data[barrier] = data[leastIndex];
                    data[leastIndex] = tmp;
                }
            }

        }
    }
}
