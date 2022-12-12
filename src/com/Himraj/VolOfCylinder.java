package com.Himraj;

import java.util.Scanner;

public class VolOfCylinder {
    public static void main(String[] args) {
        // formula: 3.14 r^2 h where r is the radius of the base of the cylinder and h is the height of the cylinder.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        System.out.print("Volume of the cylinder: ");
        System.out.println(cylinderVolume(r, h));

    }

    static float cylinderVolume(float radius, float height) {
        return 3.14f * (radius * radius * height);
    }
}
