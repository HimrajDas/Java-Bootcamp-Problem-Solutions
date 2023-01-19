package com.Funtions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        boolean ans = checkPrime(n);
        if (ans) System.out.println("It's a prime number.");
        else System.out.println("It's not a prime number.");
        // boolean ans = isPrime(13);
    }

    static boolean checkPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i * j == n) return false;
            }
        }

        return true;
    }


    // very optimized solution.
    // Time complexity --> root of n
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int x = 2;
        while (x * x <= n) {
            if (n % x == 0) {
                return false;
            }
            x++;
        }
        return x * x > n;
    }
}
