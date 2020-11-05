package com.lucapruneti.hackerrank.arrays;

public class LeftRotation {

    /**
     * @param a, An array of integers
     * @param d, the number of rotations
     * @return the resulting array of integers rotated
     */
    static int[] rotLeft(int[] a, int d) {

        int[] b = new int[a.length];

        for (int i = 0, j = d; i < a.length; i++, j++) {
            b[i] = a[j % a.length];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : b) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder.toString().trim());

        return b;
    }
}
