package com.prowings.hashtable;

import java.util.Hashtable;

public class HashTableTresholdDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String,Integer>  ht =  new  Hashtable<>();
		
		
		System.out.println(ht.put("AAA",123));
		System.out.println(ht.put("BBB",456));
		System.out.println(ht.put("CCC",789));
		System.out.println(ht.put("DDD",152));
		System.out.println(ht.put("EEE",57));
		System.out.println(ht.put("FFF",789));
		System.out.println(ht.put("GGG",987));
		System.out.println(ht.put("HHH",432));
		System.out.println(ht.put("III",543));
		
		
		System.out.println("Get ==="+ht.get("AAA"));

	    System.out.println("size === "+ht.size());
	    
	    System.out.println("isEmpty === "+ht.isEmpty());
		
		
		
		
		System.out.println(ht);
		
	}

}
