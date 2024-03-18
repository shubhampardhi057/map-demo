package com.prowings.treemap;

import java.util.TreeMap;

public class TreeMapCarDemo {

	public static void main(String[] args) {
		
		Car c1 = new Car(2012,"Audi");
		Car c2 = new Car(2017,"Bmw");
		Car c3 = new Car(2014,"Skoda");
		Car c4 = new Car(2018,"Vokswagan");
		
		
		TreeMap<Car,Integer>  tmap  = new  TreeMap<>();
		
		tmap.put(c1,1111);
		tmap.put(c2,2222);
		tmap.put(c3,3333);
		tmap.put(c4,4444);
		
		
		System.out.println(tmap);
	}
}
