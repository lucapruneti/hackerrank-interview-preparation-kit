package com.lucapruneti.hackerrank.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingAnagramsTest {

    @Test
    public void makeAnagram00Test(){

        String a = "cde";
        String b = "abc";

        assertEquals(4, MakingAnagrams.makeAnagram(a, b));
    }

    @Test
    public void makeAnagram01Test(){

        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        assertEquals(30, MakingAnagrams.makeAnagram(a, b));
    }

    @Test
    public void makeAnagram15Test(){

        String a = "showman";
        String b = "woman";

        assertEquals(2, MakingAnagrams.makeAnagram(a, b));
    }

}
