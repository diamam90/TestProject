package Lesson7;

public class PersonDemo {

	public static void main(String[] args) {
		Person pers1 = new Person("≈бланий", 36);
		Person pers2 = new Person();

		System.out.println(pers1.getFullName() + " " + pers1.getAge());
		System.out.println(pers2.getFullName() + " " + pers2.getAge());

		pers2.talk(pers1.getFullName());

	}

}
