package practice;

import java.util.Scanner;

public class NumberSqaureSeriesLoop
{
	public static void main(String[] args) {
		
		System.out.print("Enter number:");
		int number = new Scanner(System.in).nextInt();
		num(number);
	}
	
	public static void num(int n){
		if(n==1){
			System.out.println (1);
		}	
		else{
		for (int i=0, j=2; i<n; i++, j*=j) 
			System.out.println (j); 
		}
	}	
}		