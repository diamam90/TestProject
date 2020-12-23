package Lesson10;

public class FruitShop {

	public static void main(String[] args) {
		Apricot apricot1 = new Apricot(3.3, 25);
		Apricot apricot2 = new Apricot(1.2, 15);
		Pear pear1 = new Pear(0.3, 40);
		Pear pear2 = new Pear(1, 45);
		Apple apple1 = new Apple(5, 10);
		Apple apple2 = new Apple(6, 12);
		Apple apple3 = new Apple(7, 9);

		System.out.println(apricot1.getCost());
		System.out.println(apricot2.getCost());
		System.out.println(pear1.getCost());
		System.out.println("Всего продано фруктов: " + Fruit.getNumberOfFruit());
		System.out.println("Общая стоимость проданных абрикосов: " + Apricot.getAllCostApricot());
		System.out.println("Общая стоимость проданных яблок: " + Apple.getAllCostApple());
		System.out.println("Общая стоимость проданных груш: " + Pear.getAllCostPear());
		Fruit.printManufacturer();
	}

}
