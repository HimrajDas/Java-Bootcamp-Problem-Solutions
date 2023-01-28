package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] numbs = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(numbs, 3)));

    }


    // Simple iteration.
    static int[] shuffle(int[] numbs, int n) {
        // Time complexity-- O(n)
        // Space complexity-- O(1)
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = numbs[i];
            ans[2 * i + 1] = numbs[n + i];
        }

        return ans;

    }



}
