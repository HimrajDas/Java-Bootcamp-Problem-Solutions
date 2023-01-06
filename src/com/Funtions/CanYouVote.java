package com.Funtions;

import java.util.Scanner;

public class CanYouVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        boolean ans = isQualified(age);
        if (ans) System.out.println("You can vote!");
        else System.out.println("You can't vote!");

    }

    static boolean isQualified(int n) {
        return n >= 18;
    }
}
