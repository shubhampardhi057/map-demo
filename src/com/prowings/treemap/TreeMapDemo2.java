package com.prowings.treemap;

import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
		TreeMap<String,Integer>  tmap = new TreeMap<>(new StringDecendingComparator());
		
		
		tmap.put("AAA", 1111);
		tmap.put("DDD", 4444);
		tmap.put("BBB", 2222);
		tmap.put("CCC", 3333);
		
		
		
		
		System.out.println(tmap);
	}

}
