package com.company;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
//        testStringChars();

//        printMatrix();

/*        цикл с обменом элементов
        выглядит как сдвиг элементов на 1, а один элемент бросило в конец.
        итеративные сортировки. Пузырьком, выборками, вставкой. У всех есть функция swap и двойной
        вложенный цикл.
*/
        int[] array = new int[]{5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length - 1; i++) {
//            swap(array, i, i + 1);
//        }
////      [1, 3, 4, 0, 8, 9, 7, 6, 2, 5]
//        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length - 1; i++) {
            conditionalSwap(array, i, i + 1);
        }
//      [1, 3, 4, 0, 5, 8, 7, 6, 2, 9]
        System.out.println(Arrays.toString(array));

        // бинарный поиск/поиск делением пополам. Сначала сравнивается с началом и концом массива, потом с его серединой.
      // потом переход либо левее либо правее
//      30 делений на два позволяет обойти отсортированный массив размером около миллирада
// сколько теннисных мячиков может поместиться в боинг. Пусть мяч 5 см диаметр. Длина примерно 50 метров. 25 рядов. Ширина
//        в 6 кресел.
    }

    private static void swap(int[] array, int i, int i1) {
        final int tmp = array[i];
        array[i] = array[i1];
        array[i1] = tmp;
    }

    /**
     * При условном изменении: самое большое число оказалось справа
     */
    private static void conditionalSwap(int[] array, int i, int i1) {
        if (array[i] > array[i1]) {
            final int tmp = array[i];
            array[i] = array[i1];
            array[i1] = tmp;
        }
    }

    //        декартово проиведение выглядит как двойной вложенный цикл
    private static void printMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "," + j + "] ");
            }

            System.out.println();
        }
    }

    private static void testStringChars() {
        String test = "test";
        final char[] chars = test.toCharArray();
        final String test1 = new String(chars).intern();
        System.out.println(test == test1); // true
    }
}
