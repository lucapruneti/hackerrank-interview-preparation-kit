package com.lucapruneti.hackerrank.arrays;

public class LeftRotation {

    static void swap(int idx1, int idx2, int[] a) {
        int tmp1 = a[idx1];
        int tmp2 = a[idx2];

        a[idx2] = tmp1;
        a[idx1] = tmp2;
    }

    static void rotate(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            swap(i, i + 1, a);
    }

    /**
     * @param a, An array of integers
     * @param d, the number of rotations
     * @return the resulting array of integers rotated
     */
    static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++)
            rotate(a);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : a) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder.toString().trim());

        return a;
    }
}
