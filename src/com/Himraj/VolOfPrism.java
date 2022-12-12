package com.Himraj;

import java.util.Scanner;

public class VolOfPrism {
    public static void main(String[] args) {
        // formula v = bh where b is area of the base and h is height.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of the prism: ");
        float b = in.nextFloat();
        System.out.print("Enter height of the prism: ");
        float h = in.nextFloat();
        System.out.print("Volume of the prism: ");
        System.out.println(prismVolume(b, h));
    }

    static float  prismVolume(float base, float height) {
        return base * height;
    }
}
