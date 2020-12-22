package Lesson10;

public class Flower {
	private String country;
	private int storageLife;
	private double cost;
	Flower(String country, int storageLife, double cost){
		this.country=country;
		this.storageLife=storageLife;
		this.cost=cost;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getStorageLife() {
		return storageLife;
	}
	public void setStorageLife(int storageLife) {
		this.storageLife = storageLife;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
