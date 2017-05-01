package com.java;

import java.util.Scanner;

public class FibonacciRecursion {

	public int fibonacciSeries(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return n;
		}else{
			return fibonacciSeries(n-1) + fibonacciSeries(n-2);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciRecursion fcr = new FibonacciRecursion();
		System.out.println("Enter number to print fibonacci series upto given number: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("fibonacci numbers upto  "+number+":");
		for(int i=0; i<=number; i++){
			System.out.println(fcr.fibonacciSeries(i)+" ");
		}
	}

}
