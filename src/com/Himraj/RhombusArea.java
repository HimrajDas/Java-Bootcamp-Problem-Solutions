package com.Himraj;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first diagonal: ");
        float d1 = in.nextFloat();
        System.out.print("Enter second diagonal: ");
        float d2 = in.nextFloat();
        float ans = areaOfRhombus(d1, d2);
        System.out.println(ans);
    }

    static float areaOfRhombus(float d1, float d2) {
        float formula = (d1 * d2) / 2;
        return formula;
    }
}
