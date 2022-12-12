package com.Himraj;

import java.util.Scanner;

public class IsoTriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        float ans = (b * h) / 2;
        System.out.print("Area = ");
        System.out.println(ans);
    }
}
