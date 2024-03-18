package com.prowings.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class WordOccuranceUsingHashMap2 {
	
	public static void main(String[] args) {
		
	String input = "India is my country India has 29 states India is beautiful country";
		
		
		String[] words = input.split(" ");
		
		System.out.println(Arrays.toString(words));
	
		HashMap<String, Integer> map = new HashMap<>();

		for(String word : words)
		{
			Integer oldCount = map.get(word);
			
			if (oldCount == null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, oldCount+1);
			}
		}
		
		for(String k : map.keySet())
		{
			System.out.println(k +" := " + map.get(k));
		}
	}

}
