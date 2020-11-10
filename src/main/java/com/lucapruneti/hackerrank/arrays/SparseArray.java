package com.lucapruneti.hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;

public class SparseArray {

    /**
     * There is a collection of input strings and a collection of query strings.
     * For each query string, determine how many times it occurs in the list of input strings.
     * Return an array of the results.
     *
     * @param strings, an array of strings to search
     * @param queries, an array of query strings
     * @return an array of results for each query
     */
    public static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String, Integer> dict = new HashMap<>();
        for (String s : strings) {
            if (!dict.containsKey(s))
                dict.put(s, 0);
            dict.put(s, dict.get(s) + 1);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = dict.containsKey(queries[i]) ? dict.get(queries[i]) : 0;
        }

        return result;
    }
}
