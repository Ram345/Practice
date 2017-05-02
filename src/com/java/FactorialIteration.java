package com.java;

import java.util.Scanner;

public class FactorialIteration {

	public long factorialIteration(int number){
		long result = 1;
		if(number == 1){
			return 1;
		}else{
			for(int i = 2; i <= number; i++ ){
				result *= i;
			}
		return result;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialIteration fi = new FactorialIteration();
		System.out.println("factorial number:");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("Factorial of number "+number+" is:"+fi.factorialIteration(number));
	
	}

}
