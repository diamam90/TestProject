package Lesson7;

public class PersonDemo {

	public static void main(String[] args) {
		Person pers1 = new Person("�������", 36);
		Person pers2 = new Person();
		Person pers3= new Person("������ �.�.", 30);
		System.out.println(pers1.getFullName() + " " + pers1.getAge());
		System.out.println(pers2.getFullName() + " " + pers2.getAge());

		pers2.talk(pers1.getFullName());
		System.out.println(pers3.toString());
		System.out.println((new Person("������ �.�",26).toString()));
	}

}
