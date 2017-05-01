package com.java;

import java.util.Scanner;

public class FactorialRecursion {

	public int factorialRecursion(int n){
		if(n<=1){
			return 1;
		}else{
			return n*factorialRecursion(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialRecursion fr = new FactorialRecursion();
		System.out.println("factorial number:");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("Factorial of number "+number+" is:"+fr.factorialRecursion(number));
	}

}
