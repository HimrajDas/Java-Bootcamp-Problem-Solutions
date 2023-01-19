package com.Funtions;

import java.util.Scanner;

public class SumOfNNaturalNumbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println(sumOfNNaturals(n));
    }

    static int sumOfNNaturals(int n) {
        return (n * (n + 1)) / 2;
    }
}
