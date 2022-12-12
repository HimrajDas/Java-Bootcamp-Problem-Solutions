package com.Himraj;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi = 3.14F;
        System.out.print("Enter radius: ");
        float radius = in.nextFloat();
        float formula = pi * radius * radius;
        System.out.printf("Area = %f", formula);
    }
}
