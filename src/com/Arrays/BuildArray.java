package com.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] numbs = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(numbs)));
    }

    static int[] buildArray(int[] numbs) {
        // This creates an extra space.
        int[] ans = new int[numbs.length];
        for (int i : numbs) ans[i] = numbs[numbs[i]];
        return ans;
    }

}
