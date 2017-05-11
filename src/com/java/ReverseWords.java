package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {

public String reverseWords(String str){
		
		String result = null;
		String[] words =  str.split(" ");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		int size = list.size();
		for (int i=0; i<list.size(); i++) {
			String temp = list.get(0);
			list.remove(0);
			list.add(((size-1)-i), temp);
//			System.out.println("==>>"+list.toString());
		}
		System.out.println("==>>"+list.toString());

		
		return result;
	}
	
	public String reverse(String str){
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		String result = "";
		for(int i = words.length - 1; i>=0; i--){
			sb.append(words[i]);
			sb.append(" ");
			result = sb.toString().trim();
		}
		System.out.println("==>>"+result);
		return result;		
	}
	public static void main(String[] args) {
		ReverseWords rs = new ReverseWords();
		// TODO Auto-generated method stub
		String str = "Hi I am Ram";
		
		//String result = rs.reverseWords(str);
		String result = rs.reverse(str);
	}
}
