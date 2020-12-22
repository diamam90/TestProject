package Lesson10;

public class Pear extends Fruit {
	private static double allCostPear;
	private double price;
	private double weight;
	private double cost;
	Pear(double weight, double price) {
		this.price=price;
		this.weight=weight;
		numberOfFruit++;
		allCostPear+=weight*price;
	}
	public void setCost(double price) {
		this.price=price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCost() {
		cost = weight*price;
		return cost;
	}
	public static double getAllCostPear() {
		return allCostPear;
	}
	
}
