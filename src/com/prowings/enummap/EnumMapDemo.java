package com.prowings.enummap;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

enum Size{
	
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	Size()
	{
		System.out.println("constructor invoked!!");
	}
}
public class EnumMapDemo {
	
	public static void main(String[] args) {
		
		EnumMap<Size,Integer>  emap = new EnumMap<>(Size.class);
		
		emap.put(Size.EXTRALARGE,111);
		emap.put(Size.LARGE,222);
		emap.put(Size.MEDIUM,333);
		emap.put(Size.SMALL,444);
		
		
		System.out.println(emap);
		
		Set<Size> myset = emap.keySet();
		
		Iterator<Size> itr = myset.iterator();
		
		while(itr.hasNext())	
		{
			Size k = itr.next();
			
			System.out.println("Key : "+k+"Value :"+ emap.get(k));
		}
	}

}
