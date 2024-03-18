 package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapGetKeyByUsingValue {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("AAA",1111);
		map.put("BBB",2222);
		map.put("CCC",3333);
		map.put("DDD",4444);
		map.put("EEE",5555);
		map.put("FFF",6666);
		
		
		System.out.println(map);
		
		Integer value = 6666;
		
		
		Set<Map.Entry<String,Integer>>  myset = map.entrySet();
		
		for(Map.Entry<String,Integer>  e : myset)
		{
			if(e.getValue().equals(value))
			{
				System.out.println(value + " := "+ e.getKey());
			}
		}
		
		
	}
	 
		
		
		
	

}
