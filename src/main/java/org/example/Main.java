package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double square_root(double a) {
        if(a < 0) return -1;

        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("!-- Welcome to calculator --!");
            System.out.println();
            System.out.println("Please Enter Your Choice");
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Square Root");
            System.out.println();

            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            System.out.println();

            if(choice == 0)
            {
                System.out.println("Thanks for using Calculator!");
                break;
            }
            else if(choice == 1)
            {
                System.out.print("Enter First Number: ");
                double a = sc.nextDouble();
                System.out.print("Enter Second Number: ");
                double b = sc.nextDouble();

                System.out.println();
                System.out.println("Final Result: " + add(a,b));
            }
            else if(choice == 2)
            {
                System.out.print("Enter the Number: ");
                double a = sc.nextDouble();

                double res = square_root(a);
                if(res == -1) System.out.println("Enter a valid Input >= 0");
                else
                {
                    System.out.println();
                    System.out.println("Final Result: " + res);
                }
            }
            else
            {
                System.out.println("Invalid Choice!");
            }
            System.out.println();
        }
    }
}