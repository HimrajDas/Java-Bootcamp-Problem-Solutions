package com.Himraj;

import java.util.Scanner;

public class ProductAndSumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int number = sc.nextInt();
        int result = productOfTheInteger(number) - sumOfTheInteger(number);
        System.out.print("The difference between product and sum of its digits: ");
        System.out.println(result);

    }

    static int productOfTheInteger(int n) {
        int productOfTheInteger = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            productOfTheInteger *= rem;
        }
        return productOfTheInteger;
    }

    static int sumOfTheInteger(int n) {
        int sumOfTheInteger = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sumOfTheInteger += rem;
        }
        return sumOfTheInteger;
    }

    // And the best solution:-
    static int subtractProductAndSum(int n) {
        int p = 1, s = 0;
        while (n > 0) {
            p *= n % 10;
            s += n % 10;
            n /= 10;
        }
        return p - s;
    }
}