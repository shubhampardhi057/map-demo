package com.prowings.treemap;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String,Integer>  tmap = new TreeMap<>();
		
		tmap.put("AAA",111);
		tmap.put("CCC",333);
		tmap.put("DDD",444);
		tmap.put("BBB",222);
		
		System.out.println(tmap);
	}

}
