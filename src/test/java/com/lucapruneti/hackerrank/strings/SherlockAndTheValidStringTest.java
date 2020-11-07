package com.lucapruneti.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndTheValidStringTest {

    @Test
    public void isValidWithoutRemovableCharacter() {
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aabb"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aaabbb"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aaaaa"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("a"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("abcdefghhgfedcba"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aab"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aaabb"));
    }

    @Test
    public void isValidEvenTest() {
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aabb"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aabba"));
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("aabbc"));
    }

    @Test
    public void isValidOddTest() {
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("abcd"));
        Assert.assertEquals("NO", SherlockAndTheValidString.isValid("abcddd"));
    }

    @Test
    public void isValid00Test() {
        Assert.assertEquals("NO", SherlockAndTheValidString.isValid("aabbcd"));
    }

    @Test
    public void isValid01Test() {
        Assert.assertEquals("NO", SherlockAndTheValidString.isValid("aabbccddeefghi"));
    }

    @Test
    public void isValid18Test() {
        Assert.assertEquals("YES", SherlockAndTheValidString.isValid("abcdefghhgfedecba"));
    }

}
