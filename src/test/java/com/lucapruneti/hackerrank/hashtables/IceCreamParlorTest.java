package com.lucapruneti.hackerrank.hashtables;

import org.junit.Assert;
import org.junit.Test;

import static com.lucapruneti.hackerrank.hashtables.IceCreamParlor.Tuple;

public class IceCreamParlorTest {

    @Test
    public void whatFlavor01Test() {
        int[] cost = {1, 4, 5, 3, 2};
        int money = 4;

        Tuple result = IceCreamParlor.whatFlavors(cost, money);
        Assert.assertEquals(1, result.a);
        Assert.assertEquals(4, result.b);
    }

    @Test
    public void whatFlavor02Test() {
        int[] cost = {2, 2, 4, 3};
        int money = 4;

        Tuple result = IceCreamParlor.whatFlavors(cost, money);
        Assert.assertEquals(1, result.a);
        Assert.assertEquals(2, result.b);
    }

    @Test
    public void whatFlavor03Test() {
        int[] cost = {1, 2, 3, 5, 6};
        int money = 5;

        Tuple result = IceCreamParlor.whatFlavors(cost, money);
        Assert.assertEquals(2, result.a);
        Assert.assertEquals(3, result.b);
    }

    @Test
    public void whatFlavor04Test() {
        int[] cost = {4, 3, 2, 5, 7};
        int money = 8;

        Tuple result = IceCreamParlor.whatFlavors(cost, money);
        Assert.assertEquals(2, result.a);
        Assert.assertEquals(4, result.b);
    }

    @Test
    public void whatFlavor05Test() {
        int[] cost = {7, 2, 5, 4, 11};
        int money = 12;

        Tuple result = IceCreamParlor.whatFlavors(cost, money);
        Assert.assertEquals(1, result.a);
        Assert.assertEquals(3, result.b);
    }

}
