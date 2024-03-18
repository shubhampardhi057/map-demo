package com.prowings.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMapByValues {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> mark = new HashMap<>();
		
		mark.put("Math",98);
		mark.put("Data structure",89);
		mark.put("Database",91);
		mark.put("Java",95);
		mark.put("Operating System",79);
		mark.put("Networking",80);
		
		System.out.println("Map before sorting by values :"+ mark);
		
		Map<String,Integer> sortedmark = sortByMarks(mark);
		
		
        Set<Map.Entry<String,Integer>> setE = sortedmark.entrySet();
		
		for(Map.Entry<String,Integer> e : setE)
		{
			
			System.out.println("@"+e.getKey()+ "# : =  "+ e.getValue());
		}
			
		System.out.println("Map after sorting by values :"+ sortedmark);

		
	}

	private static Map<String, Integer> sortByMarks(HashMap<String, Integer> mark) {
		
		
		Set<Map.Entry<String,Integer>> entriesSet = mark.entrySet();
		
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
