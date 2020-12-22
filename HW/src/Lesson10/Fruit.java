package Lesson10;

public abstract class Fruit {
	protected static int numberOfFruit;
	private double weight;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
		}
	public static final void printManufacturer() {
		System.out.println("Сделано в Европе");
		}
	public abstract double getCost();
	public static int getNumberOfFruit() {
		return numberOfFruit;
	}
		
}
