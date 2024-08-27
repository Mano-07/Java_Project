package org.greens.fib;

import java.util.Scanner;

public class FibonacciSeries {
	
	    public static void main(String[] args)
	    {
			Scanner input = new Scanner(System.in);
	        System.out.println("Enter the Fibonacci Range :");
	        int f = input.nextInt();
	        int[] num = new int[f];
	        num[0]=0;
	        num[1]=1;
	        for(int i=2;i<f;i++)
	        {
	            num[i] = num[i-1]+num[i-2];
	        }
	        System.out.print("Fibonacci Series: ");
	        for(int i=0;i<f;i++)
	        {
	            System.out.print(num[i] +" ");
	        }
	    }
	}


