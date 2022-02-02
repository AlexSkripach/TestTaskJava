package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)throws java.io.IOException
    {
        String number;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = in.next();
        if(Check(number) == true) {
            result = Double.parseDouble(number);
            if (result % 2 == 0) {
                System.out.println("Even number\n");
            } else {
                System.out.println("Not even number\n");
            }
        }
        else
        {
            System.out.println("Input is not a digit\n");
        }
    }

    public static boolean Check(String number)
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