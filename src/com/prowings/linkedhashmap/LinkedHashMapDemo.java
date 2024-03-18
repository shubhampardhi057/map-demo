package com.prowings.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		
		map.put("AAA",123);
		map.put("BBB",456);
		map.put("CCC",789);
		
			
		System.out.println(map);
	}

}
