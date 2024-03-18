package com.prowings.enummap;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EnumMapDemoDays {
	
	public static void main(String[] args) {
		
		EnumMap<Days,Integer>  emap = new EnumMap<>(Days.class);
		
		emap.put(Days.SUNDAY,111);
		emap.put(Days.MONDAY,222);
		emap.put(Days.TUESDAY,333);
		emap.put(Days.WEDNSEDAY,444);
		emap.put(Days.THURSDAY,555);
		emap.put(Days.FRIDAY,666);
		emap.put(Days.SATURDAY,777);
		
		
		System.out.println(emap);
		
		Set<Entry<Days, Integer>>  mymap= emap.entrySet();
		
		Iterator<Entry<Days,Integer>> itr = mymap.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Entry : "+ itr.next());
		}
		
		System.out.println(emap.hashCode());
		
//		emap.clear();
		
		System.out.println(emap.size());
		
		System.out.println(emap.isEmpty());
		
	}

}
