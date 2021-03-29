package Lesson8;

public class veterinarian {
	public static void main(String[] args) {
		Dog dog1 = new Dog("мясо", "на улице", 38, "ротвеллер");
		Dog dog2 = new Dog("мясо", "дом", 8, "пудель");
		Cat cat1 = new Cat("корм", "дом", "перс", 3500);
		Cat cat2 = new Cat("мыши", "деревня", "дворовая", 0);
		Horse horse1 = new Horse("Сено", "ферма", 160, 5);
		dog2.printInfoAnimal();
		cat2.printInfoAnimal();
		horse1.printInfoAnimal();
		treatAnimal(cat1);
		Animal[] vet = { dog1, dog2, cat1, cat2, horse1 };
		for (Animal animal : vet) {
			System.out.println(animal.getAnimalNature() + " записан к ветеринару");
		}

	}

	public static void treatAnimal(Animal animal) {
		System.out.println("еда животного: " + animal.getFood());
		System.out.println("среда обитания: " + animal.getLocation());

	}
}
