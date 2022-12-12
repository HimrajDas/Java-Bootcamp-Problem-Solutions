package com.Himraj;

import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        // formula:- 4/3 x 3.14 x r^3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        System.out.print("Volume of the sphere: ");
        System.out.println(sphereVolume(r));
    }

    static float sphereVolume(float radius) {
        return (float) (4 * 3.14f * Math.pow(radius, 3)) / 3;
    }
}
