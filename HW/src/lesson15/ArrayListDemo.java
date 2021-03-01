package lesson15;
import Lesson7.Phone;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		List<Phone> phones = new ArrayList<>();
		phones.add(new Phone("samsung","+746745674"));
		phones.add(new Phone("nokia","+11"));
		phones.add(new Phone("samsung","+1111",123123));
		System.out.println(phones);
		for (Phone p:phones) {
			System.out.println(p.getNumber());
		}
		phones.forEach(p->System.out.println(p.getModel()));
	}

}
