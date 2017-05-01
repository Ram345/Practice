package com.java;

import java.util.Scanner;

public class FibonacciIteration {

	public int fibonacciSeries(int n){
		int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciIteration fci = new FibonacciIteration();
		System.out.println("Enter number to print fibonacci series upto given number: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("fibonacci numbers upto  "+number+":");
		for(int i=0; i<=number; i++){
			System.out.println(fci.fibonacciSeries(i)+" ");
		}

	}

}
