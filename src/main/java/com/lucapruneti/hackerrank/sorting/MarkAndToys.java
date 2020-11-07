package com.lucapruneti.hackerrank.sorting;

import java.util.Arrays;

public class MarkAndToys {

    /**
     * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some.
     * There are a number of different toys lying in front of him, tagged with their prices.
     * Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
     *
     * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy?
     *
     * @param prices, an array of integers representing toy prices
     * @param k, an integer, Mark's budget
     * @return An integer that denotes the maximum number of toys Mark can buy for his son.
     */
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int maxToys = 0;
        int spent = 0;

        for (int i =0; i<prices.length; i++){
            spent += prices[i];
            if(spent <= k){
                maxToys++;
            } else
                break;
        }

        return maxToys;
    }

}
