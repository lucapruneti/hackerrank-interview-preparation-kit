package com.lucapruneti.hackerrank.sorting;

public class BubbleSort {

    private static void swap(int idx1, int idx2, int[] a) {

        int tmp1 = a[idx1];
        int tmp2 = a[idx2];

        a[idx1] = tmp2;
        a[idx2] = tmp1;
    }

    static int countSwaps(int[] a) {

        int counter = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);
                    counter++;
                }
            }

        }

        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

        return counter;
    }

}
