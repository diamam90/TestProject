package Lesson10;

public class Cactus extends Flower{
	private int age;
	Cactus(String country, int storageLife, double cost, int age){
		super(country,storageLife, cost);
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
