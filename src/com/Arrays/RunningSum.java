package com.Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }


    // Not a good approach at all.
    static int[] runningSum1(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] += nums[j];
            }
        }

        return runningSum;
    }

    // A better way.
    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
