package com.Himraj;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operation: ");
            char operation = in.next().trim().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
                System.out.print("Enter two number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                switch (operation) {
                    case '+' -> System.out.println("Ans = " + (num1 + num2));
                    case '-' -> System.out.println("Ans = " + (num1 - num2));
                    case '*' -> System.out.println("Ans = " + (num1 * num2));
                    case '/' -> {if (num2 != 0) {
                        System.out.println("Ans = " + (num1 / num2));}
                    }
                    case '%' -> System.out.println("Reminder = " + (num1 % num2));
                }
            } else if (operation == 'x' || operation == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
        }

    }
}
