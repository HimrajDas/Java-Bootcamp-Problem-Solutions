package com.Himraj;

import java.util.Scanner;

public class DistBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y1 = in.nextFloat();
        float y2 = in.nextFloat();
        System.out.println(distance(x1, x2, y1, y2));
    }

    static float distance(float x1, float x2, float y1, float y2) {
        float x = x2 - x1;
        float y = y2 - y1;
        return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
