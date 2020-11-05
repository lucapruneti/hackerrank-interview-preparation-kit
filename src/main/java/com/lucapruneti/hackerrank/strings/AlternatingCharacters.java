package com.lucapruneti.hackerrank.strings;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int counter = 0;
        char prev = 0;

        for(char c : s.toCharArray()){
            if(c != prev)
                prev = c;
            else
                counter++;

        }

        return counter;
    }
}
