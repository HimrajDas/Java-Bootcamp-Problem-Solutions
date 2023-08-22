package com.Arrays;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gains = {-4, -3, -2, -1, 4, 3, 2};
        // System.out.println(largestAltitude(gains));
    }

    // Brute-Force sol by me. Good in memory but bad in runtime (1ms).
    static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;

        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = gain[i - 1] + altitude[i - 1];
        }

        return Arrays.stream(altitude).max().getAsInt();
    }

    static int largestAltitude2(int[] gain) {
        int prefixSum = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            prefixSum += gain[i];
            max = Math.max(max, prefixSum);
        }

        return max;
    }
}
