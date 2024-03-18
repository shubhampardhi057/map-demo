package com.prowings.treemap;

import java.util.Comparator;

public class BikeNameComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike o1, Bike o2) {
		
		
		return o1.name.compareTo(o2.name);
	}
	
	

}
