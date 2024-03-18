package com.prowings.navigablemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapMethodOnTreeMap {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String>  tmap = new TreeMap<>();
		
		tmap.put(10,"AAA");
		tmap.put(40,"DDD");
		tmap.put(20,"BBB");
		tmap.put(50,"EEE");
		tmap.put(30,"CCC");
		
		
		System.out.println(tmap);
	
		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());

		
		System.out.println("lower key :"+ tmap.lowerKey(30));
		System.out.println("lower Entry :"+ tmap.lowerEntry(40));
		
		
		System.out.println("higher key :"+ tmap.higherKey(30));
		System.out.println("higher Entry :"+ tmap.higherEntry(40));
	
		
		System.out.println("ceiling key :"+ tmap.ceilingKey(17));
		System.out.println("ceiling Entry :"+ tmap.ceilingEntry(34));
		
		
		System.out.println("floor key :"+ tmap.floorKey(17));
		System.out.println("floor Entry :"+ tmap.floorEntry(34));
		
		
		
		System.out.println("poll first Entry :"+tmap.pollFirstEntry());
		System.out.println("poll last Entry :"+tmap.pollLastEntry());
		
		System.out.println("After poll Method :"+tmap);
		
		
		Map<Integer, String>  nmap = tmap.descendingMap();
		
		System.out.println("dmap :"+nmap);
		
		
		Set<Integer>  decendingKeys = tmap.descendingKeySet();
		
		System.out.println(decendingKeys);
		
		
	    Set<Integer> navigablemap =tmap.navigableKeySet();
	    
	    System.out.println("navigablemap:="+ navigablemap);
		
		
	    Map<Integer, String> headMap = tmap.headMap(30,true);
	    
	    System.out.println(headMap);
	    
	    
	    Map<Integer, String> tailMap = tmap.tailMap(30,true);
	    
	    System.out.println(tailMap);
	    
	    Map<Integer, String> subMap = tmap.subMap(20, true, 50, true);
	    
	    System.out.println(subMap);
	}

}
