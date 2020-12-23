package Lesson7;

public class Person {
	private String fullName;
	private int age;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void move(String person) {
		System.out.println("такой то " + person + " говорит");
	}

	void talk(String person) {
		System.out.println("такой-то " + person + " идет");
	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public Person() {

	}
}
