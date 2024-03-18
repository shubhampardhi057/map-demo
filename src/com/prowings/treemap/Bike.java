package com.prowings.treemap;

public class Bike {
	
	int model;
	String name;
	
	public Bike() {
		super();
	}
	
	
	public Bike(int model,String name) {
		super();
		
		this.model=model;
		this.name=name;
	}


	@Override
	public String toString() {
		return "Bike [model=" + model + ", name=" + name + "]";
	}
	
	

}
