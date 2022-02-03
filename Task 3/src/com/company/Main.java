package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double number1 = in.nextDouble();
        System.out.println("Enter your second number: ");
        double number2 = in.nextDouble();
        if(number1 % number2 == 0)
        {
            result = number1 / number2;
            System.out.println("Result: ");
            System.out.println(result);
        }
        else
        {
            System.out.println("Can not be fully devided! ");
        }
    }
}
