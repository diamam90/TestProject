package Lesson7;

public class PersonDemo {

	public static void main(String[] args) {
		Person pers1 = new Person("Ебланий", 36);
		Person pers2 = new Person();
		Person pers3= new Person("Иванов Д.С.", 30);
		System.out.println(pers1.getFullName() + " " + pers1.getAge());
		System.out.println(pers2.getFullName() + " " + pers2.getAge());

		pers2.talk(pers1.getFullName());
		System.out.println(pers3.toString());
		System.out.println((new Person("Петров В.В",26).toString()));
	}

}
