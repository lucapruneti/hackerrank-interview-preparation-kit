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

    private static void addFlavorToMenu(int cost, int idx, Map<Integer, List<Integer>> menu) {
        if (!menu.containsKey(cost)) {
            menu.put(cost, new ArrayList<>());
        }
        menu.get(cost).add(idx);
    }

    /**
     * @param cost,  an array of integers representing price for a flavor
     * @param money, an integer representing the amount of money they have to spend
     */
    static Tuple whatFlavors(int[] cost, int money) {

        Map<Integer, List<Integer>> menu = new HashMap<>();

        for (int i = 0; i < cost.length; i++) {
            addFlavorToMenu(cost[i], i + 1, menu);
        }

        int splitMoney = money / 2;

        if (money % 2 == 0)
            if (menu.containsKey(splitMoney))
                if (menu.get(splitMoney).size() > 1) {
                    List<Integer> idx = menu.get(splitMoney);
                    return new Tuple(idx.get(0), idx.get(1));
                }

        int idx1 = -1;
        int idx2 = -1;

        for (int i = money % 2 == 0 ? splitMoney - 1 : splitMoney, j = splitMoney + 1; i < money && j < money; i--, j++) {
            if (menu.containsKey(i) && menu.containsKey(j)) {
                //found solution
                idx1 = menu.get(i).get(0);
                idx2 = menu.get(j).get(0);
                break;
            }
        }

        System.out.println(Math.min(idx1, idx2) + " " + Math.max(idx1, idx2));

        return new Tuple(Math.min(idx1, idx2), Math.max(idx1, idx2));
    }
}
