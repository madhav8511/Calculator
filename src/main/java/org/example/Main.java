package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double square_root(double a)
    {
        if(a < 0) return -1;

        return Math.sqrt(a);
    }

    public static double power(double a, double b)
    {
        return Math.pow(a,b);
    }

    public static int factorial(int n)
    {
        if(n < 0) return -1;

        int ans = 1;
        for(int i = 1; i <= n; i++)
        {
            ans *= i;
        }
        return ans;
    }

    public static double logarithm(double a)
    {
        if(a <= 0) return -1;

        return Math.log(a);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("!-- Welcome to calculator --!");
            System.out.println();
            System.out.println("Please Enter Your Choice");
            System.out.println("0. Exit");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Power");
            System.out.println("4. Logarithm");
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
                System.out.print("Enter the Number for Square Root: ");
                double a = sc.nextDouble();

                double res = square_root(a);
                if(res == -1)
                {
                    System.out.println();
                    System.out.println("Enter a valid Input >= 0");
                }
                else
                {
                    System.out.println();
                    System.out.println("Final Result: " + res);
                }
            }
            else if(choice == 2)
            {
                System.out.print("Enter the Number for Factorial: ");
                int a = sc.nextInt();

                int res = factorial(a);
                if(res == -1)
                {
                    System.out.println();
                    System.out.println("Enter a valid Input >= 0");
                }
                else
                {
                    System.out.println();
                    System.out.println("Final Result: " + res);
                }
            }
            else if(choice == 3)
            {
                System.out.print("Enter the Base number: ");
                double base = sc.nextDouble();
                System.out.print("Enter the Exponent number: ");
                double exponent = sc.nextDouble();

                double res = power(base,exponent);
                System.out.println();
                System.out.println("Final Result: " + res);
            }
            else if(choice == 4)
            {
                System.out.print("Enter the Number for Logarithm: ");
                double a = sc.nextDouble();

                double res = logarithm(a);
                if(res == -1)
                {
                    System.out.println();
                    System.out.println("Enter a valid Input > 0");
                }

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