package com.Funtions;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        // System.out.println(max(n1, n2, n3));
        System.out.println(min(n1, n2, n3));

    }

    static int max(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) return n1;
        else if (n2 > n1 && n2 > n3) return n2;
        else return n3;
    }

    static int min(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) return n1;
        else if (n2 < n1 && n2 < n3) return n2;
        else return n3;
    }
}
