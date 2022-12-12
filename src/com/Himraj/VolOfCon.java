package com.Himraj;

import java.util.Scanner;

public class VolOfCon {
    public static void main(String[] args) {
        // formula:- 3.14 * r*r * h/3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        System.out.print("Enter height: ");
        float h = in.nextFloat();
        float ans = conVolume(r, h);
        System.out.print("Volume of the cone: ");
        System.out.println(ans);

    }

    static float conVolume(float radius, float height) {
        return 3.14f * radius * radius * (height / 3);
    }
}
