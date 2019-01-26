package com.bilgeadam.cars;

public class Car {
	private Engine engine;
	private GearType gearType;
	private int capacity;
	private String color;
	
	
	public Car(Engine engine, GearType gearType, int capacity, String color) {
		this.engine = engine;
		this.gearType = gearType;
		this.capacity = capacity;
		this.color = color;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public GearType getGearType() {
		return gearType;
	}


	public void setGearType(GearType gearType) {
		this.gearType = gearType;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Car) {
			Car e = (Car) o;
			if(e.engine.getSerialNumber().equals(this.engine.getSerialNumber())) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return ""+ this.engine.toString()
				+ ", gear type : "+ this.gearType.name()
				+", capacity : " + this.capacity
				+", color : " + this.color;
	}
	
}
