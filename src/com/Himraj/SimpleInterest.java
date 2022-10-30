package com.Himraj;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        float p = input.nextFloat();
        System.out.print("Enter rate if interest: ");
        float r = input.nextFloat();
        System.out.print("Enter time: ");
        float t = input.nextFloat();

        float simpleInterest = (p * r * t) / 100;

        System.out.println("SI = " + simpleInterest);
    }
}
