package com.company;

public class Main {

    public static void main(String[] args) {
        int tmp=0;
        String [] Array1 = new String[100];

        for(int i=0; i < 100; i++ )
        {
            if((tmp+1) % 2 == 0) {
                Array1[i] = (tmp + 1) + "";
                Array1[i + 1] = "&";
                tmp++;
                i++;
            }
            else
            {
                tmp++;
                i--;
            }
        }
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Element " + (i+1) + ": " + Array1[i]);
        }
    }
}
