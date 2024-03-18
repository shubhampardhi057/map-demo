package com.prowings.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapValuesMthodDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer>  mymap = new HashMap<>();
		
		System.out.println(mymap.put("AAA",123));
		System.out.println(mymap.put("BBB",456));
		System.out.println(mymap.put("CCC",789));
		System.out.println(mymap.put("DDD",321));
		System.out.println(mymap.put("EEE",654));
		System.out.println(mymap.put("FFF",987));
		
		System.out.println(mymap);
		
		Collection<Integer>  myvalues = mymap.values();
		
		Iterator<Integer> itr = myvalues.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
