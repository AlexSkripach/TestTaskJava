package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)throws java.io.IOException
    {
        String number1, number2;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        number1 = in.next();
        System.out.println("Enter your second number: ");
        number2 = in.next();
        Check2(number1);
        Check2(number2);
    }

    public static void Check2(String number)
    {
        if (Check1(number) == true) {
            double result = Double.parseDouble(number);
            if (result % 2 == 0) {
                System.out.println("Even number\n");
            } else {
                System.out.println("Not even number\n");
            }
        } else {
            System.out.println("Input is not a digit\n");
        }
    }

    public static boolean Check1(String number)
    {
        int tmp = 0;
        char[] Numbers = number.toCharArray();

        for(int i = 0; i < Numbers.length; i++) {

            if (Character.isDigit(Numbers[i]) | Numbers[i]=='.') {
            }
            else {
                tmp++;
            }
        }
        if(tmp == 0) {
            return true;
        }
        else
        {
            return false;
        }
    }
}