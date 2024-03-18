package com.prowings.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapUsingCustomComparator {
	
	public static void main(String[] args) {
		
		Bike b1 = new Bike(2021, "Bajaj");
		Bike b2 = new Bike(2018, "Bmw");
		Bike b3 = new Bike(2017, "Honda");
		
		
		System.out.println("sorting by model :=");
		
		TreeMap<Bike,Integer> tmap = new TreeMap<>(new BikeModelComparator());
		
		tmap.put(b1,1111);
		tmap.put(b2,2222);
		tmap.put(b3,3333);
		
		
		System.out.println(tmap);
		
		System.out.println("sorting by name :=");
		
		TreeMap<Bike,Integer> tmap1 = new TreeMap<>(new BikeNameComparator());
		
		tmap1.put(b1,1111);
		tmap1.put(b2,2222);
		tmap1.put(b3,3333);
		
		
		System.out.println(tmap1);

	}

}
