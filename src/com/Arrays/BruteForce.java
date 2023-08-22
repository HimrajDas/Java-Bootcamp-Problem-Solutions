package com.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForce {
    public static void main(String[] args) {
        int[] numbs = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        ArrayList<Integer> ans = targetArray(numbs, index);
        // System.out.println(targetArray(numbs, index));
    }

    static ArrayList<Integer> targetArray(int[] numbs, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbs.length; i++) {
            arr.add(index[i], numbs[i]);
        }

        return arr;
    }


}
