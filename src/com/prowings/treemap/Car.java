package com.prowings.treemap;

public class Car implements Comparable<Car> {
	
	int model;
	String name;
	
	public Car() {
		super();
	}
	
	public Car(int model,String name) {
		super();
		
		this.model=model;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Car o) {
		
		if(this.model == o.model)
			return 0;
		else if(this.model > o.model)
		    return 1;
		else
			return -1;
	}
	
	

}
