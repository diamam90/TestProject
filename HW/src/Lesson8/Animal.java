package Lesson8;

public class Animal {
	private String animalNature = "��������";
	private String food;
	private String location;

	public Animal(String food, String location) {
		setFood(food);
		setLocation(location);
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String getAnimalNature() {
		return animalNature;
	}

	public void printInfoAnimal() {
		System.out.println();
		System.out.println("����� �������� : \t" + getLocation());
		System.out.println("��� : \t" + getFood());
		System.out.println();
	}

}
