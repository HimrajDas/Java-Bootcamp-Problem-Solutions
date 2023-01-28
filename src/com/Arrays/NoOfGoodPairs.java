package com.Arrays;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 1, 1, 3};
        int[] arr = {1, 1, 1, 1};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs += 1;
                }
            }
        }

        return pairs;
    }
}
