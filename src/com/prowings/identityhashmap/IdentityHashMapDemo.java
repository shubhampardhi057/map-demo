package com.prowings.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(2021,"FORTUNER");
		Car c2 = new Car(2022,"VIRTUS");
		Car c3 = new Car(2023,"BMW340i");
		Car c4 = new Car(2020,"POLO");
		Car c5 = new Car(2020,"POLO");
		
		Car c6 = c4;
		
		
		
		HashMap<Car,Integer> map = new HashMap<>();
		
		map.put(c1,123);
		map.put(c2,456);
		map.put(c3,789);
		map.put(c4,543);
		map.put(c5,543);
		map.put(c6,543);

		
		System.out.println(map);
		
		System.out.println("============================================");
		
		
		IdentityHashMap<Car,Integer> imap = new IdentityHashMap<>();
		
		imap.put(c1,1111);
		imap.put(c2,2222);
		imap.put(c3,3333);
		imap.put(c4,4444);
		imap.put(c5,5555);
		
		System.out.println(imap);
	}

}
