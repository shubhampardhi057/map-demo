package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WaysToIterateHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("AAA",123);
		map.put("BBB",456);
		map.put("CCC",789);
		map.put("DDD",321);
		map.put("EEE",654);
		map.put("FFF",987);
		
		System.out.println("Iterating by keyset() with Iterator :- ");
		
		Set<String>  myset = map.keySet();
		
		Iterator<String>  itr = myset.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key+ "  "+ map.get(key));
		}
		
		System.out.println("Iterating by Entryset() with Iterator :- ");
		
		Set<Map.Entry<String,Integer>> myset1 = map.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr1 = myset1.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry<String,Integer>  mapE = itr1.next();
			
			System.out.println(mapE.getKey() +"   "+ mapE.getValue());
		}
		
		
		System.out.println("Iterating by Keyset() with For-Each loop :- ");
		
		Set<String>  setmy = map.keySet();
		
		for(String k : setmy)
		{
			System.out.println(k +"  "+ map.get(k));
		}
		
		System.out.println("Iterating by Entryset() with For-Each loop :- ");
		
		Set<Map.Entry<String,Integer>> setE = map.entrySet();
		
		for(Map.Entry<String,Integer> e : setE)
		{
			
			System.out.println(e.getKey()+ "  "+ e.getValue());
			
		}
		
	}

}
