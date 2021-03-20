package com.company;

import java.util.Arrays;

public class NestedLoopDiagonal {
    public static void main(String[] args) {
        printMatrix();

//        int[] array = new int[]{5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
//        System.out.println(Arrays.toString(array));
    }

    //        декартово проиведение выглядит как двойной вложенный цикл
//    "-" по диагонали

    /*
      -++++
      --+++
      ---++
      ----+
      -----
     */
    private static void printMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i < j) ? "+" : "-");
            }

            System.out.println();
        }
    }
}
