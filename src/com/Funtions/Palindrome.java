package com.Funtions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int revN = checkPalindrome(n);
        if (n == revN) System.out.println("It's palindrome.");
        else System.out.println("It's not a palindrome.");
    }

    static int checkPalindrome(int n) {
        int originalN = n;
        int ans = 0;
        while (n > 0) {
            int reminder = n % 10;
            n /= 10;
            ans = ans * 10 + reminder;
        }

        return ans;
    }
}
