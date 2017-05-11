package com.java;

public class StrCharcterDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "snow";
		String str2 = "wons";
		int count = 0;		
		for(int i=0; i<str1.length() && i<str2.length(); i++){
			if(str1.toLowerCase().charAt(i) != str2.toLowerCase().charAt(i)){
				count++;
			}
		}
		if(count >1) System.out.println("fasle==>>"+count);
		else System.out.println("true");
	}


}
