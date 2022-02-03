package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double number1 = in.nextDouble();
        System.out.println("Enter your second number: ");
        double number2 = in.nextDouble();
        System.out.println("Enter your third number: ");
        double number3 = in.nextDouble();
        double result = (number1 + number2 + number3)/3;
        System.out.println("Result: ");
        System.out.println(result);
    }
}
