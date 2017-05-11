package com.java;

public class CheckNumberOfOperations {

	public void countOperations(){
		// Use * and - operations. Always subtract with 1.
		// Ex: 2 , 4 and result 15
		// 2*4 = 8
		// 2*8 = 16
		// 16-1 = 15
		
		int a = 2, b = 4, result = 15, count = 0;
		if(a*b <= result){
			int temp = a * b;
			count++;
			while(temp < result){
				temp = a*temp;
				count++;
				while(temp > result){
					temp = temp-1;
					count++;
				}
			}
		}
		System.out.println("====Number of Operations====>>>"+count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumberOfOperations oc = new CheckNumberOfOperations();
		oc.countOperations();

	}

}
