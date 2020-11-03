package com.lucapruneti.hackerrank.hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote {

    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> dictionary = new HashMap<>();

        for(String m : magazine){
            if(!dictionary.containsKey(m))
                dictionary.put(m, 0);
            dictionary.put(m, dictionary.get(m) + 1);
        }

        for (String n : note){
            if(!dictionary.containsKey(n))
                return "No";

            dictionary.put(n, dictionary.get(n) - 1);

            if(dictionary.get(n) == 0)
                dictionary.remove(n);
        }

        return "Yes";
    }

}
