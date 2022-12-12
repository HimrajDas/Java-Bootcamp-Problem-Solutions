package com.Himraj;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = sc.nextFloat();
        float ans = 0.433f * side * side;
        System.out.print("Area = ");
        System.out.println(ans);
    }
}
