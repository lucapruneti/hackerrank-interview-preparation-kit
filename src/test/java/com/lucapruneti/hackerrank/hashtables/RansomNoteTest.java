package com.lucapruneti.hackerrank.hashtables;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void testCheckMagazine00Test(){

        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");

        Assert.assertEquals("Yes", RansomNote.checkMagazine(magazine, note));
    }

    @Test
    public void testCheckMagazine20Test(){

        String[] magazine = "two times three is not four".split(" ");
        String[] note = "two times two is four".split(" ");

        Assert.assertEquals("No", RansomNote.checkMagazine(magazine, note));
    }

    @Test
    public void testCheckMagazine21Test(){

        String[] magazine = "ive got a lovely bunch of coconuts".split(" ");
        String[] note = "ive got some coconuts".split(" ");

        Assert.assertEquals("No", RansomNote.checkMagazine(magazine, note));
    }

}
