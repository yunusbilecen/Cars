package com.bilgeadam.cars;

public class TestCar {

	public static void main(String[] args) {
		Engine engine1 = new Engine("1231246464", 105, 5, EngineType.DIESEL);
		Car car1 = new Car(4, "White", engine1, GearType.AUTOMATIC, 5);
		
		Engine engine2 = new Engine("12321412512", 1000, 3, EngineType.GASOLINE);
		Boat boat1 = new Boat(0, "Black", engine2, GearType.MANUAL);
		
		Mechanic m = new Mechanic();
		m.fixVehicle(boat1);
	}

}
