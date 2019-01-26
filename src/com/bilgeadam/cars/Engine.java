package com.bilgeadam.cars;

public class Engine {
	private String serialNumber;
	private int horsePower, volume;
	private EngineType engineType;
	
	public Engine(String serialNumber, int horsePower, int volume, EngineType engineType) {
		this.serialNumber = serialNumber;
		this.horsePower = horsePower;
		this.volume = volume;
		this.engineType = engineType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Engine) {
			Engine e = (Engine) o;
			if(e.serialNumber.equals(this.serialNumber)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Engine serial number : "+ this.serialNumber
				+ ", horse power : "+ this.horsePower
				+", volume : " + this.volume
				+", engine type : " + this.engineType.name();
	}
}
