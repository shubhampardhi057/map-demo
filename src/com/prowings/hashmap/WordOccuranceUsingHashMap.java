package com.prowings.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordOccuranceUsingHashMap {
	
	public static void main(String[] args) {
		
		String input = "india is my country india has 29 states india is beautiful";
		
		String [] words = input.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String word : words)
		{
			if(map.containsKey(word))
			{
				map.put(word,map.get(word)+1);
				
			}
			else
			{
				map.put(word,1);
			}
			
			
		}
		
		Set<String> set = map.keySet();
		
		for(String k : set)
		{
			System.out.println(k + " :="+ map.get(k));
		}
		
		
		
		
		Map<String, Integer> sortByCountMap = sortByValues(map);
		
		 Set<Map.Entry<String,Integer>> setE = sortByCountMap.entrySet();
			
		for(Map.Entry<String,Integer> e : setE)
		{
				
			System.out.println("@  "+e.getKey()+ "# : =  "+ e.getValue());
		}
		
		System.out.println(sortByCountMap);
		
	
	}
	
       private static Map<String, Integer> sortByValues(HashMap<String, Integer> map) {
		
		
		Set<Map.Entry<String,Integer>> entriesSet = map.entrySet();
		
		List<Map.Entry<String,Integer>> entriesList = new ArrayList<>(entriesSet);
		
		
		Collections.sort(entriesList,new EntryComparatorByValue());
		
		
		Map<String,Integer>  sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String,Integer> entry : entriesList)
		{
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		return sortedMap;
	
	}

}
