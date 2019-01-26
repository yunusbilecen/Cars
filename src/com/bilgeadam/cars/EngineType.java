package com.bilgeadam.cars;

public enum EngineType {
	DIESEL(1), GASOLINE(2), HYBRID(3), ELECTRIC(4);
	
	private int num;
	
	private EngineType(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	
}
