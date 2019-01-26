package com.bilgeadam.cars;

public class Boat extends Vehicle{
	private Engine engine;
	private GearType gearType;
	
	
	public Boat(int numOfTyres, String color, Engine engine, GearType gearType) {
		super(numOfTyres, color);
		this.engine = engine;
		this.gearType = gearType;
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
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Boat) {
			Boat e = (Boat) o;
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
				+ ", gear type : "+ this.gearType.name();
	}

	@Override
	public boolean startEngine() {
		return true;
	}

	@Override
	public double calculateConsumeRate(int miles) {
		
		return miles / gearType.consumeRatePerMile(engine.getEngineType());
	}
	
}
