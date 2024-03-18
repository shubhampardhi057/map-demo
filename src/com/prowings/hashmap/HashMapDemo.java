package com.prowings.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> mymap = new HashMap<>();
		
		System.out.println(mymap.size());
		
		System.out.println(mymap.isEmpty());
		
		
		System.out.println(mymap.put("AAA",123));
		System.out.println(mymap.put("BBB",456));
		System.out.println(mymap.put("CCC",789));
		System.out.println(mymap.put("DDD",321));
		System.out.println(mymap.put("EEE",654));
		System.out.println(mymap.put("FFF",987));
		
		System.out.println(mymap.size());
		
		System.out.println(mymap.isEmpty());
		
		
		
		System.out.println("get(K)===>>"+mymap.get("BBB"));
		
		System.out.println("get(K)===>>"+mymap.get("EEE"));
		
		
		System.out.println(mymap.containsKey("DDD"));
		
		System.out.println(mymap.containsValue(789));
		
		
		
		Map<String,Integer>  mymap1 = new HashMap<>();
		
		
		mymap1.putAll(mymap);
		
		System.out.println("mymap1:==>>"+mymap1);
		
//		mymap1.clear();
		
		System.out.println("mymap1 after clear :==>>"+mymap1);
		
		
		
		System.out.println("Before remove :==>>"+mymap);
		
		mymap.remove("CCC");
		
		System.out.println("After remove :==>>"+mymap);
		
		System.out.println(mymap.hashCode());
		
		System.out.println(mymap1.hashCode());
		
		
		
		
		
		System.out.println(mymap.equals(mymap1));
		
		
		System.out.println(mymap.get("VVV"));
		
		
		
		
		
		
		
	}

}
