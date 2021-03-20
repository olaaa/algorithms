package com.company;

public class NestedLoopDiagonal {
    public static void main(String[] args) {
        printMatrix();
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
