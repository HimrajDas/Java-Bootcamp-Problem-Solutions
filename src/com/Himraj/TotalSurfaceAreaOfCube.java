package com.Himraj;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        // formula:- 6a^2, where a is the side length of the cube.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        float a = input.nextFloat();
        System.out.print("Total surface area of the cube: ");
        System.out.println(cubeTotalSurfaceArea(a));
    }

    static float cubeTotalSurfaceArea(float sideLength) {
        return 6 * (sideLength * sideLength);
    }
}
