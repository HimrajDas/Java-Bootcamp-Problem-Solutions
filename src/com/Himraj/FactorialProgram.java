package com.Himraj;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(factorial(number));
    }

    static int factorial(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n;
            n -= 1;
        }
        return ans;
    }
}
