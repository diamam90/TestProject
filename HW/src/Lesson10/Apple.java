package Lesson10;

public class Apple extends Fruit {
	private static double allCostApple;
	private double weight;
	private double price;
	private double cost;

	Apple(double weight, double price) {
		this.weight = weight;
		this.price = price;
		numberOfFruit++;
		allCostApple += weight * price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		cost = weight * price;
		return cost;
	}

	public static double getAllCostApple() {
		return allCostApple;
	}

}
