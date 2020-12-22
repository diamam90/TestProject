package com.company.details;

public class Engine {
	private int power;
	private String manufacturer;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Engine(int power,String manufacturer) {
		setPower(power);
		setManufacturer(manufacturer);
	}
	public void printInfoEngine() {
		System.out.print("Мощность: " + getPower() + ", производитель: " +getManufacturer());
	}
}
