package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n, tmp=1;
        System.out.println("Enter how many items Array will take: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String[] Array1 = new String[n];
        for(int i = 0; i < n; i++)
        {
            for(int j = tmp; j != 100; j++)
            {
                if(j%2 == 0)
                {
                    Array1[i] = j +"";
                    tmp = j+1;
                    j = 99;
                    if(i != (n-1))
                    {
                        Array1[i+1] = "&";
                        i++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++)
            {
                System.out.println("Element " + (i + 1) + ": " + Array1[i]);
            }
        }
    }
