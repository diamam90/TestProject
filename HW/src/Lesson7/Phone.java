package Lesson7;

import java.util.Arrays;

public class Phone {
	static int count = 0;
	private String model;
	private String number;
	private double weight;

	Phone(String m, String n, double w) {
		this(n, m);
		weight = w;

	}

	Phone(String m, String n) {
		model = m;
		number = n;
		count++;
	}

	Phone() {
		count++;
	}

	public String getModel() {
		return model;
	}

	public String getNumber() {
		return number;
	}

	public double getWeight() {
		return weight;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void recieveCall(String name) {
		System.out.println("Calling " + name);
	}

	void recieveCall(String name, String number) {
		System.out.println("Calling " + name + " with number " + number);
		System.out.println("My number " + this.number);
	}

	void sendMessage(String message, String... numbers) {
		System.out.println("Message " + message + " is sending to " + Arrays.toString(numbers));
	}

	static void membersOfClass() {
		System.out.println("Количество телефонов: " + count);
	}

}
