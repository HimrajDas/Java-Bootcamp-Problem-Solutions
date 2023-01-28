package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(highestCandies2(candies, extraCandies));
    }

    static List<Boolean> highestCandies(int[] arr, int extraCandies) {
        // int capacity = arr.length - 1;
        List<Boolean> ans = new ArrayList<>();

        int maxValue = 0;

        for (int i : arr) {
            if (i > maxValue) maxValue = i;
        }

        for (int i : arr) {
            if (i + extraCandies >= maxValue) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }

    static List<Boolean> highestCandies2(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i : candies) {
            max = Math.max(i, max);
        }
        for (int i : candies) {
            ans.add(i + extraCandies >= max);
        }
        return ans;
    }
}
