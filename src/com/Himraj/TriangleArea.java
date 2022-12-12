package com.Himraj;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter h: ");
        float h = sc.nextFloat();
        System.out.print("Enter b: ");
        float b = sc.nextFloat();
        float formula = (h * b) / 2;
        System.out.print("Area = ");
        System.out.println(formula);
    }
}
