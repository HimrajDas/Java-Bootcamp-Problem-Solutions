package com.Funtions;

import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(product(num1, num2));
    }

    static int product(int n1, int n2) {
        return n1 * n2;
    }
}
