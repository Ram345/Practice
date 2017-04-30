package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void duplicateWords(String sentense){
		String[] words = sentense.split(" ");
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		
		for(String word: words){
			if(wordsMap.containsKey(word)){
				wordsMap.put(word, wordsMap.get(word)+1);
			} else{
				wordsMap.put(word, 1);
			}
		}
		Set<String> wordsSet = wordsMap.keySet();
		for(String word : wordsSet){
			System.out.println(word+": Count==>"+wordsMap.get(word));
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWords("Java is Java and not Java is no java");

	}

}
