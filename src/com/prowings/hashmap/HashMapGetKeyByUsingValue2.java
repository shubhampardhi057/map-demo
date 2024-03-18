package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapGetKeyByUsingValue2 {
	
	public static void main(String[] args) {
		
        HashMap<String, Integer> mymap = new HashMap<>();
		
		System.out.println(mymap.put("AAA", 123));
		System.out.println(mymap.put("BBB", 999));
		System.out.println(mymap.put("CCC", 333));
		System.out.println(mymap.put("DDD", 567));
		
		
		System.out.println("find keys by specified value :");
		
		
		Integer value = 333;
		
		String key = getKey(mymap,value);
		
		System.out.println("key is :- "+ key);
	}

	private static String getKey(HashMap<String, Integer> map, Integer value) {
		
		
		Set<String> keyset = map.keySet();
		
		Integer val = null;
		
		
		
		for(String k : keyset)
		{
			
			val = map.get(k);
			
			if(val.equals(value))
			{
				return k;
			}
		}
		
		return null;
		
	}

}
