package com.Himraj;

import java.util.Scanner;

public class VolOfPyramid {
    public static void main(String[] args) {
        // formula:- lwh / 3, where l is base length, w is base width and h is pyramid height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base width: ");
        float w = in.nextFloat();
        System.out.print("Enter base length: ");
        float l = in.nextFloat();
        System.out.print("Enter pyramid height: ");
        float h = in.nextFloat();
        System.out.println(pyramidVolume(l, w, h));
    }
    
    static float pyramidVolume(float length, float width, float height) {
        return (length * width * height) / 3;
    }
}
