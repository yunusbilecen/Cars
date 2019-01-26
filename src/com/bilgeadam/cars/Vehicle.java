package com.bilgeadam.cars;

public abstract class Vehicle {
	private int numOfTyres;
	private String color;
	
	public Vehicle(int numOfTyres, String color) {
		this.numOfTyres = numOfTyres;
		this.color = color;
	}
	
	public abstract boolean startEngine();
	public abstract double calculateConsumeRate(int miles);

	public int getNumOfTyres() {
		return numOfTyres;
	}

	public void setNumOfTyres(int numOfTyres) {
		this.numOfTyres = numOfTyres;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
