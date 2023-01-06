package com.Funtions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = in.nextInt();
        grade(score);
    }

    static void grade(int score) {
        if (score > 100) System.out.println("Enter a valid score");
        if (score > 90) System.out.println("AA");
        else if (score > 80) System.out.println("AB");
        else if (score > 70) System.out.println("BB");
        else if (score > 60) System.out.println("BC");
        else if (score > 50) System.out.println("CD");
        else if (score > 40) System.out.println("DD");
        else System.out.println("Fail!");
    }
}
