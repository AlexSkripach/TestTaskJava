package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = in.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Even number\n");
        }
        else
        {
            System.out.println("Not even number\n");
        }

    }
}