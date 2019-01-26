package com.bilgeadam.cars;

public enum GearType {
	MANUAL{

		@Override
		public double consumeRatePerMile(EngineType e) {
			return e.getNum();
		}
		
	}, 
	AUTOMATIC{

		@Override
		public double consumeRatePerMile(EngineType e) {
			return e.getNum() * 2;
		}
		
	};
	
	public abstract double consumeRatePerMile(EngineType e);
}
