package com.Funtions;

import java.util.Scanner;

public class Circle {
    // Circumference of circle:- C = 2 * pi * r
    // Area of circle:- A = pi * r * r
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = in.nextFloat();
        // System.out.printf("Area  = %.2f", area(radius));
        System.out.printf("Circumference = %.2f", circumference(radius));
    }

    static float area(float r) {
        return 3.14f * r * r;
    }

    static float circumference(float r) {
        return 2 * 3.14f * r;
    }
}
