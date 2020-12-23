package Lesson10;

public class Tulip extends Flower {
	private String color;
	private int temperature;

	Tulip(String country, int storageLife, double cost, String color, int temperature) {
		super(country, storageLife, cost);
		this.color = color;
		this.temperature = temperature;
	}
}
