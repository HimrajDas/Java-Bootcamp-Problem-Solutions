package com.Himraj;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the power: ");
        int p = in.nextInt();
        System.out.println(powerOfNumber(n, p));
    }

    static int powerOfNumber(int n, int p) {
        return (int) Math.pow(n, p);
    }
}
