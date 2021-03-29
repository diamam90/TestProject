package Lesson8;

public class Horse extends Animal {
	private String animalNature = "������";
	private int height;
	private int age;

	public Horse(String food, String location, int height, int age) {
		super(food, location);
		setHeight(height);
		setAge(age);
	}

	public String getAnimalNature() {
		return animalNature;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printInfoAnimal() {
		System.out.println();
		System.out.println("������");
		System.out.println("����� �������� : \t" + getLocation());
		System.out.println("��� : \t" + getFood());
		System.out.println("������ : \t" + getHeight());
		System.out.println("������� : \t" + getAge());
		System.out.println();
	}
}