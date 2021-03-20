package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        int mid = (low + high) >>> 1; // беззнаковый сдвиг вправо
        System.out.println(mid); // 2147483647
        mid = (low + high) / 2;
        System.out.println(mid); // -1 неправильно!!

        mid = low + ((high - low) / 2); // 2147483647 правильно
        System.out.println(mid);
    }
}
