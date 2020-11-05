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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tuple tuple = (Tuple) o;
            return a == tuple.a &&
                    b == tuple.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    /**
     * @param cost,  an array of integers representing price for a flavor
     * @param money, an integer representing the amount of money they have to spend
     */
    static Tuple whatFlavors(int[] cost, int money) {

        Map<Integer, Integer> menu = new HashMap<>();

        for (int i = 0; i < cost.length; i++) {
            int tmpCost = cost[i];
            int diff = money - tmpCost;

            if (menu.containsKey(diff)) {
                System.out.println(menu.get(diff) + " " + (i + 1));
                return new Tuple(menu.get(diff), i + 1);
            } else
                menu.put(tmpCost, i + 1);
        }

        throw new UnsupportedOperationException("Not Found");
    }
}
