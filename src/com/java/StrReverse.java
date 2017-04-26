package com.java;

public class StrReverse {

	public void reverseString(String str){
		StringBuilder reverse = new StringBuilder();
		for(int i = str.length() - 1; i >=0; i--){
			reverse.append(str.charAt(i));
		}
		System.out.println("reverse===>>"+reverse.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrReverse sr = new StrReverse();
		sr.reverseString("Hello");
	}

}
