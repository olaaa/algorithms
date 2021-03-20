package com.company;

public class NestedLoopDependentInnerCounter {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 3, 4};
        printMatrix(array);
    }

    /**
     * 5
     * 5 1
     * 5 1 3
     * 5 1 3 4
     */
    private static void printMatrix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[j] + " ");
            }

            System.out.println();
        }
    }
}
