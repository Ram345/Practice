package com.java;

public class CombinationOfString {

	public void permutations(String str){
		permutations("",str);
		
	}
	
	public void permutations(String prefix, String str){
		
		int n = str.length();
		if(n==0){
			System.out.println(prefix);
		}else{
			for(int i=0; i< n; i++){
			//	System.out.println("==="+str.substring(0, i));
				permutations(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, n));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationOfString cs = new CombinationOfString();
		cs.permutations("abc");
	}

}