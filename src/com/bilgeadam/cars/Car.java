package com.bilgeadam.cars;

public class Car extends Vehicle implements Fixable{
	private Engine engine;
	private GearType gearType;
	private int capacity;
	
	public Car(int numOfTyres, String color, Engine engine, GearType gearType, int capacity) {
		super(numOfTyres, color);
		this.engine = engine;
		this.gearType = gearType;
		this.capacity = capacity;
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
				+", capacity : " + this.capacity;
	}


	@Override
	public boolean startEngine() {
		return true;
	}


	@Override
	public double calculateConsumeRate(int miles) {
		return miles / gearType.consumeRatePerMile(engine.getEngineType());
	}


	@Override
	public void getFixed() {
		System.out.println("Car get fixed");
	}

}
