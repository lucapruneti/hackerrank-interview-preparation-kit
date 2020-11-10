package com.lucapruneti.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SparseArrayTest {
    @Test
    public void matchingStrings10Test() {

        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};

        Assert.assertArrayEquals(new int[]{2, 1, 0}, SparseArray.matchingStrings(strings, queries));
    }

    @Test
    public void matchingStrings11Test() {

        String[] strings = {"def", "de", "fgh"};
        String[] queries = {"de", "lmn", "fgh"};

        Assert.assertArrayEquals(new int[]{1, 0, 1}, SparseArray.matchingStrings(strings, queries));
    }

    @Test
    public void matchingStrings12Test() {

        String[] strings = {"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"};
        String[] queries = {"abcde", "sdaklfj", "asdjf", "na", "basdn"};

        Assert.assertArrayEquals(new int[]{1, 3, 4, 3, 2}, SparseArray.matchingStrings(strings, queries));
    }
}
