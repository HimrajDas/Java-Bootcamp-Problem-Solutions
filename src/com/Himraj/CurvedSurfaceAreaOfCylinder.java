package com.Himraj;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // formula:- 2 x 3.14 x rh, where r is the radius and h is the height of the cylinder.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        System.out.print("Surface Area of the cylinder: ");
        System.out.println(cylinderSurfaceArea(r, h));
    }

    static float cylinderSurfaceArea(float radius, float height) {
        return 2 * 3.14f * radius * height;
    }
}
