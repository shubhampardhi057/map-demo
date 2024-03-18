package com.prowings.hashmap;

import java.util.HashMap;

public class HashMapDemo1 {

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
	}
}
