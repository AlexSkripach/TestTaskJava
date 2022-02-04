package com.company;

public class Main {

    public static void main(String[] args) {
        int[] Array = new int[100];
        for(int i=0; i < 100; i++ )
        {
            Array[i] = i+1;
            System.out.println("Element " + (i+1) + ": " + Array[i]);
        }
    }
}
