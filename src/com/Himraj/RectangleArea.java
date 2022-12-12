package com.Himraj;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = sc.nextFloat();
        System.out.print("Enter width: ");
        float width = sc.nextFloat();
        float ans = length * width;
        System.out.print("Area = ");
        System.out.println(ans);
    }
}
