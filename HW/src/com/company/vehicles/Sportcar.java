package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Sportcar extends Car {
	private double speed;

	public Sportcar(String carClass, String model, double weight, Driver driver, Engine engine, double speed) {
		super(carClass, model, weight, driver, engine);
		setSpeed(speed);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
