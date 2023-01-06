package com.Himraj;

import java.util.Scanner;

public class SumOfInputNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        while (n != 0) {
            sum += n;
            n = in.nextInt();
        }
        System.out.println(sum);
    }
}
