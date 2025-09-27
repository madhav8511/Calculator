package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double add(double a, double b) {
        return a + b;
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

            int choice = sc.nextInt();

            if(choice == 0)
            {
                System.out.println("Thanks for using Calculator!");
                break;
            }
            else if(choice == 1)
            {
                System.out.println("Enter First Number: ");
                double a = sc.nextDouble();
                System.out.println("Enter Second Number: ");
                double b = sc.nextDouble();

                System.out.println("Final Result: " + add(a,b));
            }
            else
            {
                System.out.println("Invalid Choice!");
            }
            System.out.println();
        }
    }
}