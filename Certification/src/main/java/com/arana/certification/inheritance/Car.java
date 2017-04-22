package com.arana.certification.inheritance;

public class Car extends Vehicle {
	
	private String trans;

	public Car() {
		this.trans = trans;
	}


	Car(String type, int maxSpeed) {
		super(type, maxSpeed);
		this.trans = null;
	}

}
