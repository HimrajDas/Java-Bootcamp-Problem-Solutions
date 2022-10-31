package com.Himraj;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter INR: ");
        float rupees = input.nextFloat();
        float usd =  rupees / 82.2877f;
        System.out.println("USD: " + usd);

    }
}
