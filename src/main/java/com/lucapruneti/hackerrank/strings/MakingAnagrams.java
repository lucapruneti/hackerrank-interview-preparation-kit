package com.lucapruneti.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    private static void addToDict(char c,
                                  Map<Character, Integer> dict) {
        if (!dict.containsKey(c))
            dict.put(c, 0);
        dict.put(c, dict.get(c) + 1);
    }

    private static void remToDict(char c,
                                  Map<Character, Integer> dict) {
        if (dict.containsKey(c)) {
            dict.put(c, dict.get(c) - 1);
            if(dict.get(c) == 0)
                dict.remove(c);
        }
    }

    /**
     * Constraints: 1<=|a|,|b|<=10^4
     *
     * @param a lowercase English alphabetic letters ascii[a-z].
     * @param b lowercase English alphabetic letters ascii[a-z].
     * @return a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
     */
    static int makeAnagram(String a, String b) {

        Map<Character, Integer> aDict = new HashMap<>();

        //counting occurrences of the first string
        for (Character c : a.toCharArray()) {
            addToDict(c, aDict);
        }

        Map<Character, Integer> bDict = new HashMap<>();

        //checking the second string
        for (Character c : b.toCharArray()) {
            if (!aDict.containsKey(c))
                addToDict(c, bDict);
            else {
                remToDict(c, aDict);
            }
        }

        int sum = aDict.values().stream().reduce(0, Integer::sum);
        sum += bDict.values().stream().reduce(0, Integer::sum);

        return sum;
    }
}
