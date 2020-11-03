package com.lucapruneti.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoDArrayDSTest {

    @Test
    public void testHourglassSum00Test(){

        int[][] hourGlass = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        Assert.assertEquals(19, TwoDArrayDS.hourglassSum(hourGlass));
    }

    @Test
    public void testHourglassSum01Test(){

        int[][] hourGlass = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        Assert.assertEquals(13, TwoDArrayDS.hourglassSum(hourGlass));
    }

    @Test
    public void testHourglassSum08Test(){

        int[][] hourGlass = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        Assert.assertEquals(28, TwoDArrayDS.hourglassSum(hourGlass));
    }


}
