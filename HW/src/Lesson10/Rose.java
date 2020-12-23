package Lesson10;

public class Rose extends Flower {
	private int lenghtRose;
	private String color;

	Rose(String country, int storageLife, double cost, int lenghtRose, String color) {
		super(country, storageLife, cost);
		this.lenghtRose = lenghtRose;
		this.color = color;
	}

	public int getLenghtRose() {
		return lenghtRose;
	}

	public void setLenghtRose(int lenghtRose) {
		this.lenghtRose = lenghtRose;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
