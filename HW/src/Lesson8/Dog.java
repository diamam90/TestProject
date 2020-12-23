package Lesson8;

public class Dog extends Animal {
	private String animalNature = "������";
	private double weight;
	private String dogBreed;

	Dog(String food, String location, double weight, String dogBreed) {
		super(food, location);
		setWeight(weight);
		setDogBreed(dogBreed);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public String getAnimalNature() {
		return animalNature;
	}

	public void printInfoAnimal() {
		System.out.println();
		System.out.println("������");
		System.out.println("����� �������� : " + getLocation());
		System.out.println("��� :\t" + getFood());
		System.out.println("��� ������ : " + getWeight());
		System.out.println("������ ������ : " + getDogBreed());
		System.out.println();
	}

}
