package com.Funtions;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        // int[] arr = {3, 1, 4, 6, 5};
        int[] arr = {10, 4, 6, 12, 5};
        System.out.println(triplet(arr));
    }


    static boolean triplet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // if ((arr[i] * arr[i] + arr[j] * arr[j]) == (arr[k] * arr[k])) return true;
                    int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];
                    if (x == y + z || y == x + z || z == x + y) return true;
                }
            }
        }
        return false;
    }

}
