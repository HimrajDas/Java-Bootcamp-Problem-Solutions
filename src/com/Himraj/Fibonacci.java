package com.Himraj;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("Enter nth term: ");
        int n = in.nextInt();
        while (count <= n) {
            int x = b;
            b = b + a;
            a = x;
            count++;
        }
        System.out.println(b);
    }
}
