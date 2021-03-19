package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Алгоритм инвертирования массива
 */
public class SwapArraySides {

    public static void main(String[] args) {
        final Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.ints(1, 100).findFirst()
                    .getAsInt();

//            от нуля и до 100 - 1 не включая
//            если минимальное начение ноль, то нужно указать только верхнюю границу
            System.out.println(random.nextInt(100 - 1) + 1);
        }
        System.out.println(Arrays.toString(array));

        invertArray(array);
        System.out.println(Arrays.toString(array));

        recursiveInvertArray(array, 0);
        System.out.println(Arrays.toString(array));

        int[] array1 = new int[]{1, 2, 3};
        invertArrayInReverseOrder(array1);
        System.out.println(Arrays.toString(array1));
    }

    private static void recursiveInvertArray(int[] array, int i) {
        if (i < array.length / 2) {
            int tmp = array[i];
            final int endIndex = array.length - 1 - i;
            array[i] = array[endIndex];
            array[endIndex] = tmp;

            recursiveInvertArray(array, i + 1);
        }
    }

    //    сделать так, чтобы шел от середины к нулю
//    ибо сравнение с нулем медленнее, чем с произвольным числом
    private static void invertArrayInReverseOrder(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            int tmp = array[i];
            final int endIndex = array.length - 1 - i;
            array[i] = array[endIndex];
            array[endIndex] = tmp;
        }
    }

    private static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            final int endIndex = array.length - 1 - i;
            array[i] = array[endIndex];
            array[endIndex] = tmp;
        }
    }
}
