package Lesson8;

public class Cat extends Animal {
	private String animalNature = "�����";
	private String breed;
	private double cost;

	public Cat(String food, String location, String breed, double cost) {
		super(food, location);
		this.breed = breed;
		this.cost = cost;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAnimalNature() {
		return animalNature;
	}

	public void printInfoAnimal() {
		System.out.println();
		System.out.println("�����");
		System.out.println("����� �������� : \t" + getLocation());
		System.out.println("��� : \t" + getFood());
		System.out.println("���� : \t" + getCost());
		System.out.println("������ : \t" + getBreed());
		System.out.println();
	}
}
