package com.lucapruneti.hackerrank.hashtables;

import java.util.*;

public class IceCreamParlor {

    static class Tuple {
        int a, b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }

    /**
     * @param cost,  an array of integers representing price for a flavor
     * @param money, an integer representing the amount of money they have to spend
     */
    static Tuple whatFlavors(int[] cost, int money) {

        Map<Integer, Integer> menu = new HashMap<>();

        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < cost.length; i++) {
            int tmpCost = cost[i];
            int diff = money - tmpCost;

            if (menu.containsKey(diff)) {
                idx1 = menu.get(diff);
                idx2 = i + 1;
                System.out.println(idx1 + " " + idx2);
                break;
            } else if (tmpCost < money)
                menu.put(tmpCost, i + 1);
        }

        return new Tuple(idx1, idx2);
    }
}
