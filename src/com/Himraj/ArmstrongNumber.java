package com.Himraj;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want  to check: ");
        int number = sc.nextInt();
        int ans = checkNumber(number);
        if (ans == number) {
            System.out.println("It's a armstrong number.");
        } else {
            System.out.println("It's not a armstrong number.");
        }

    }

    static int checkNumber(int number) {
        int originalValue = number;
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            int numLen = String.valueOf(originalValue).length();
            sum += Math.pow(reminder, numLen);
        }
        return sum;
    }
}
