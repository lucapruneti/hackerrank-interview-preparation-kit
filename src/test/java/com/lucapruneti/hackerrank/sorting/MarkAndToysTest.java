package com.lucapruneti.hackerrank.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {

    @Test
    public void maximumToys00Test() {
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int k = 50;

        Assert.assertEquals(4, MarkAndToys.maximumToys(prices, k));
    }

    @Test
    public void maximumToys16Test() {
        int[] prices = {1, 2, 3, 4};
        int k = 7;

        Assert.assertEquals(3, MarkAndToys.maximumToys(prices, k));
    }

    @Test
    public void maximumToys17Test() {
        int[] prices = {3, 7, 2, 9, 4};
        int k = 15;

        Assert.assertEquals(3, MarkAndToys.maximumToys(prices, k));
    }

}
