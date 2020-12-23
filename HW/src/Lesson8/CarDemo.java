package Lesson8;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

import Lesson7.Person;

public class CarDemo {
	public static void main(String[] args) {
		Person person1 = new Person("������ ����", 23);
		Driver driver1 = new Driver("������� �������", 23, 5);
		Driver driver2 = new Driver("�������� �������", 30, 2);
		Person person2 = new Person("������ �.�", 29);
		Person driver3 = new Driver("������ �.�.", 58, 3);
		Driver driver4 = new Driver("������ �.�.", 60, 30);
		Engine v1 = new Engine(150, "BMW");
		Engine v2 = new Engine(140, "LADA");
		Engine v3 = new Engine(700, "Lamborgini");
		Car car1 = new Car("hatchback", "2109", 900, driver1, v2);
		Car car2 = new Car("sedan", "Diablo", 1000, driver4, v3);
		car1.printInfo();
		System.out.println();
		car2.printInfo();
		System.out.println();
		car1.turnLeft();

	}

}
