package com.prowings.identityhashmap;

import java.util.Objects;

public class Car {
	
	int model;
	String name;
	
	
	public Car() {
		super();
	}


	public Car(int model, String name) {
		super();
		this.model = model;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(model, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return model == other.model && Objects.equals(name, other.name);
	}
	
	
	

}
