package com.lucapruneti.hackerrank.arrays;

public class TwoDArrayDS {

    private static int getHourGlassSum(int row,
                                       int col,
                                       int[][] arr) {
        int sum = 0;

        //Sum for HourGlass's TOP
        for (int c = col; c < col + 3; c++)
            sum += arr[row][c];

        //Adding HourGlass neck
        sum += arr[row + 1][col + 1];

        //Sum for the bottom
        for (int c = col; c < col + 3; c++)
            sum += arr[row + 2][c];

        return sum;
    }


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                max = Math.max(max, getHourGlassSum(row, col, arr));
            }
        }

        return max;
    }


}
