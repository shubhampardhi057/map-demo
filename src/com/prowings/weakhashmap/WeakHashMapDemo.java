package com.prowings.weakhashmap;

import java.util.WeakHashMap;

import com.prowings.identityhashmap.Car;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(2021,"FORTUNER");
		Car c2 = new Car(2022,"VIRTUS");
		Car c3 = new Car(2023,"BMW340i");
		Car c4 = new Car(2020,"POLO");
		
		
		WeakHashMap<Car,Integer>  wmap = new WeakHashMap<>();
		
		
		wmap.put(c1,123);
		wmap.put(c2,456);
		wmap.put(c3,789);
		wmap.put(c4,432);
		
		System.out.println("Before GC  :="+wmap);
		
		c1 = null;
		
		System.gc();
		
		
		System.out.println("After GC  :="+wmap);
		
		
		
		
		
		
		
		
		
		
		
	}

}
