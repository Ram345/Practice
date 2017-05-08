package com.java;

public class RepeatWordsInString {

	public int repeatString(String srcStr, String findStr){
		int count = 0;
		while(srcStr.length() > 0){
			if(srcStr.indexOf(findStr) != -1){
				srcStr = srcStr.substring(
						srcStr.indexOf(findStr) + findStr.length(), 
						srcStr.length());
				
				count++;
			} else{
				break;
			}
		}	
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatWordsInString rw = new RepeatWordsInString();
		String srcStr = "HelloHowruHelloHiDoingHello";
		String findStr = "Hello";
				
		int count = rw.repeatString(srcStr, findStr);
		System.out.println(findStr+" count====>>"+count);
	}

}
