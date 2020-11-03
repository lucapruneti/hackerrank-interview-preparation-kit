package com.lucapruneti.hackerrank.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class BubbleSortTest {

    @Test
    public void countSwaps00Test() {

        int[] a = {1, 2, 3};
        Assert.assertEquals(0, BubbleSort.countSwaps(a));
    }

    @Test
    public void countSwaps01Test() {

        int[] a = {3, 2, 1};
        Assert.assertEquals(3, BubbleSort.countSwaps(a));
    }

    @Test
    public void countSwaps03Test() {

        int[] a = {4, 2, 3, 1};
        Assert.assertEquals(5, BubbleSort.countSwaps(a));
    }

}
