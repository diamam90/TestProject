package com.company.vehicles;

import java.util.Arrays;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
	private String carClass;
	private String model;
	private double weight;
	Driver driver;
	Engine engine;

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void start() {
		System.out.println("�������!");
	}

	public void stop() {
		System.out.println("����!");
	}

	public void turnLeft() {
		System.out.println("��������� ������!");
	}

	public void turnRight() {
		System.out.println("��������� �������!");
	}

	public void printInfo() {
		System.out.println("����� ����: " + getModel());
		System.out.println("���: " + getWeight());
		System.out.println("�����: " + getCarClass());
		System.out.print("����� \t ");
		engine.printInfoEngine();
		System.out.println();
		System.out.print("�������� \t");
		driver.printInfoDriver();
	}

	public Car(String carClass, String model, double weight, Driver driver, Engine engine) {
		setCarClass(carClass);
		setModel(model);
		setWeight(weight);
		setDriver(driver);
		setEngine(engine);

	}

}
