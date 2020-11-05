package com.lucapruneti.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeftRotationTest {

    @Test
    public void rotLeft00Test() {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] rotated = LeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, rotated);
    }

    @Test
    public void rotLeft01Test() {
        int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int d = 10;

        int[] rotated = LeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, rotated);
    }

    @Test
    public void rotLeft10Test() {
        int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int d = 13;

        int[] rotated = LeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60}, rotated);
    }

}
