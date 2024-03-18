package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySetMethodDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> mymap = new HashMap<>();
		

		System.out.println(mymap.put("AAA",123));
		System.out.println(mymap.put("BBB",456));
		System.out.println(mymap.put("CCC",789));
		System.out.println(mymap.put("DDD",321));
		System.out.println(mymap.put("EEE",654));
		
		System.out.println(mymap.put(null,null));
		
		System.out.println("put :==>>"+mymap.put(null,214));
		
		System.out.println("put :==>>"+mymap.put(null,null));
		
		
		System.out.println(mymap);
		
		Set<Map.Entry<String,Integer>> myset  = mymap.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr = myset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(myset.hashCode());
		System.out.println(mymap.hashCode());
		
		
		
//		System.out.println(mymap.equals(myset));
	}

}
