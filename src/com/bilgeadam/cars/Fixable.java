package com.bilgeadam.cars;

public interface Fixable {
	public void getFixed();
	public static double calculateFixCost(Fixable fix) {
		if(fix instanceof Car) {
			return 1000.0;
		}else if(fix instanceof Boat) {
			return 10000.0;
		}else {
			return 0.0;
		}
	}
}
