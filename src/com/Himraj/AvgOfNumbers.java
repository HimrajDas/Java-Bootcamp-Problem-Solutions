package com.Himraj;

import java.util.Scanner;

public class AvgOfNumbers {
    // Formula of avg of N numbers:-  n(n + 1) / 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        float ans = (n + 1) / 2;
        System.out.println(ans);
    }
}
