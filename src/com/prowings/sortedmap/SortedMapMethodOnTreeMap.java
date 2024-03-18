package com.prowings.sortedmap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapMethodOnTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String>  tmap = new TreeMap<>();
		
		tmap.put(10,"AAA");
		tmap.put(40,"DDD");
		tmap.put(20,"BBB");
		tmap.put(50,"EEE");
		tmap.put(30,"CCC");
		
		
		System.out.println(tmap);
		
		
		Comparator cmp = tmap.comparator();
		
		System.out.println(cmp);
		
		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		
		Map<Integer,String> headmap = tmap.headMap(50);
		
		System.out.println(headmap);
		
		
		Map<Integer,String> tailmap = tmap.tailMap(30);
		
		System.out.println(tailmap);
		
		
		Map<Integer,String> submap = tmap.subMap(20,50);
		
		System.out.println(submap);
		
		
		
		
		
		
		
		
	}

}
