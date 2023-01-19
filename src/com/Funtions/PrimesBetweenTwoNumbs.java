package com.Funtions;

import java.util.*;

public class PrimesBetweenTwoNumbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        List<Integer> ans = primes(num1, num2);
        System.out.println(ans);
    }

    static List<Integer> primes(int range1, int range2) {
        List<Integer> ans = new ArrayList<>();
        while (range1 < range2) {
            if (isPrime(range1)) ans.add(range1);
            range1++;
        }
        return ans;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int x = 2;
        while (x * x <= n) {
            if (n % x == 0) return false;
            x++;
        }

        return x * x > n;
    }
}
