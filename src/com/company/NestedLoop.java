package com.company;

public class NestedLoop {
    public static void main(String[] args) {
        testStringChars();
    }

    private static void testStringChars() {
        String test = "test";
        final char[] chars = test.toCharArray();
        final String test1 = new String(chars).intern();
        System.out.println(test == test1); // true
    }
}
