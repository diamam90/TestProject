package Lesson10;

public class Apricot extends Fruit {
	private double cost, price, weight;
	private static double allCostApricot;

	Apricot(double weight, double price) {
		this.weight = weight;
		this.price = price;
		numberOfFruit++;
		allCostApricot += weight * price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		cost = price * weight;
		return cost;
	}

	public static double getAllCostApricot() {
		return allCostApricot;
	}

}
