package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CombinationOfTwoNumbers {

	public void combineTwoNumbers(){
		Integer arr[] = new Integer[]{1,5,6,2,8,3};
		Set<Integer> numSet = new HashSet<Integer>(Arrays.asList(arr));
		//numSet.addAll(Arrays.asList(arr));
		int total = 8;
		//int result[][] = new int[10][10];
		for(int i=0; i < arr.length; i++){
			//for(int j= 0; j<arr.length; j++){
//				if(arr[i]+arr[j] == 8){
//					System.out.println("====>>"+arr[i]+","+arr[j]);
//				}
			//}
			
			Integer diff = total - arr[i];
			//System.out.println("diff--->>>"+diff);
			
			if(numSet.contains(diff)){
				System.out.println("combinations--->>"+arr[i]+","+diff);
				numSet.remove(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationOfTwoNumbers ctn = new CombinationOfTwoNumbers();
		ctn.combineTwoNumbers();
	}


}
