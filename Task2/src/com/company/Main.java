package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double number1 = in.nextDouble();
        System.out.println("Enter your second number: ");
        double number2 = in.nextDouble();
        System.out.println("Enter your third number: ");
        double number3 = in.nextDouble();

        double Array[] = {number1, number2, number3};
        Arrays.sort(Array);
        double result = Array[1];

        System.out.println("Result: ");
        System.out.println(result);
    }
}
