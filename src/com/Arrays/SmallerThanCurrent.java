package com.Arrays;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        // int[] arr = {8, 1, 2, 2, 3};
        int[] arr = {6, 5, 4, 8};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    ans[i] += 1;
                }
            }
        }

        return ans;
    }
}
