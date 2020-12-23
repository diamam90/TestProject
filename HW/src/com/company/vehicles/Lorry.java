package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
	private int carrying;

	public Lorry(String carClass, String model, double weight, Driver driver, Engine engine, int carrying) {
		super(carClass, model, weight, driver, engine);
		setCarrying(carrying);
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}
}
