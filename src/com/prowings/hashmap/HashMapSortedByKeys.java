package com.prowings.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortedByKeys {
	
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
		
		
		TreeMap<String,Integer> tmap = new TreeMap<>(map);
	
		System.out.println(">>> After sort by keys : <<<<<");
		
		
        Set<Map.Entry<String,Integer>> sortset = tmap.entrySet();
		
		for(Map.Entry<String,Integer> e : sortset)
		{
			
			System.out.println(e);
			
		}
		
		
		
		
		
		
	
	
	}

	

}
