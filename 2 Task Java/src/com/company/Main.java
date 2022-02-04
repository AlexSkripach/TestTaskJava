package com.company;

public class Main {

    public static void main(String[] args) {
        int tmp=0;
        String [] Array = new String[100];
        for(int i=0; i < 100; i++ )
        {
            Array[i] = (tmp+1) + "";
            Array[i+1] = "&";
            tmp++;
            i++;
        }
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Element " + (i+1) + ": " + Array[i]);
        }
    }
}
