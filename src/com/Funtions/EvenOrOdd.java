package com.Funtions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of your choice: ");
        int number = sc.nextInt();
        boolean ans = isEven(number);
        if (ans) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's not an even number.");
        }
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
