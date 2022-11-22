package com.Himraj;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();
        int ans = checkPalindrome(number);
        if (ans == number) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int checkPalindrome(int number) {
        int revNum = 0;
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            revNum = revNum * 10 + reminder;
        }
        return revNum;
    }
}
