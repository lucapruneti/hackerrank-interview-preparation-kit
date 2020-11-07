package com.lucapruneti.hackerrank.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {

    /**
     * Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is
     * also valid if he can remove just 1 character at 1 index in the string, and the remaining characters will
     * occur the same number of times. Given a string s, determine if it is valid.
     *
     * @param s, the string to evaluate
     * @return a String "YES" od "NO"
     */
    static String isValid(String s) {

        // a = 97 ... z = 122
        int[] occurrences = new int[26];

        for (char c : s.toCharArray()) {
            int idx = (int) c % 97;
            occurrences[idx] += 1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : occurrences) {
            if (i > 0) {
                if (!map.containsKey(i))
                    map.put(i, 0);
                int tmp = map.get(i) + 1;
                map.put(i, tmp);
            }
        }

        //count how many type of occurrences I have
        List<Integer> keyDistinct = map.keySet().stream().distinct().collect(Collectors.toList());

        //more than two different occurrences
        if (keyDistinct.size() > 2) {
            return "NO";
        }

        //we can try to remove a character
        if (keyDistinct.size() == 2) {

            Map.Entry<Integer, Integer> minEntry = map.entrySet().stream().min(SherlockAndTheValidString::comparing).get();
            Map.Entry<Integer, Integer> maxEntry = map.entrySet().stream().max(SherlockAndTheValidString::comparing).get();

            if (minEntry.getValue() > 1)
                return "NO";

            if (minEntry.getValue() == maxEntry.getValue()) {
                int diff = Math.abs(minEntry.getKey() - maxEntry.getKey());
                return diff == 1 ? "YES" : "NO";
            }

            int remChar = minEntry.getKey() - 1;
            return (remChar == 0 || remChar == maxEntry.getKey()) ? "YES" : "NO";
        }

        //all the occurrences are the same
        return keyDistinct.size() == 1 ? "YES" : "NO";
    }

    /**
     * @param e1, the first object to be compared.
     * @param e2, the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    static int comparing(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){

        if(e1.getValue() != e2.getValue())
            return e1.getValue().compareTo(e2.getValue());

        return e1.getKey().compareTo(e2.getKey());
    }

}
