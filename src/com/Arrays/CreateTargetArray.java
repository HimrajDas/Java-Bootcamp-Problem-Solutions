package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = createTargetArray(arr, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) arr.add(index[i], nums[i]);
        for (int i = 0; i < arr.size(); i++) ans[i] = arr.get(i);
        return ans;
    }
}
