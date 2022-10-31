package com.Himraj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter operation: ");
            char operation = in.next().trim().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
                System.out.print("Enter two number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (operation == '+') {
                    ans = num1 + num2;
                } else if (operation == '-') {
                    ans = num1 - num2;
                } else if (operation == '*') {
                    ans = num1 * num2;
                } else if (operation == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else {
                    ans = num1 % num2;
                }

                System.out.println(ans);

            } else if (operation == 'x' || operation == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
