package Lesson8;

public class veterinarian {
	public static void main(String[] args) {
		Dog dog1 = new Dog("����", "�� �����", 38, "���������");
		Dog dog2 = new Dog("����", "���", 8, "������");
		Cat cat1 = new Cat("����", "���", "����", 3500);
		Cat cat2 = new Cat("����", "�������", "��������", 0);
		Horse horse1 = new Horse("����", "�����", 160, 5);
		dog2.printInfoAnimal();
		cat2.printInfoAnimal();
		horse1.printInfoAnimal();
		treatAnimal(cat1);
		Animal[] vet = { dog1, dog2, cat1, cat2, horse1 };
		for (Animal animal : vet) {
			System.out.println(animal.getAnimalNature() + " ������� � ����������");
		}

	}

	public static void treatAnimal(Animal animal) {
		System.out.println("��� ���������: " + animal.getFood());
		System.out.println("����� ��������: " + animal.getLocation());

	}
}
