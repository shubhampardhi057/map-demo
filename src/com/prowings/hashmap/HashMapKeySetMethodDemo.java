package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapKeySetMethodDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> mymap = new HashMap<>();
		
		System.out.println(mymap.put("AAA",123));
		System.out.println(mymap.put("BBB",456));
		System.out.println(mymap.put("CCC",789));
		System.out.println(mymap.put("DDD",321));
		System.out.println(mymap.put("EEE",654));
		System.out.println(mymap.put("FFF",987));
		
		
		System.out.println(mymap);
		
		Set<String>  myset = mymap.keySet();
		
		Iterator<String> itr = myset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
