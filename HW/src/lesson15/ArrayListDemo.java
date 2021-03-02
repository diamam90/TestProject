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
		
		List<String> array1 = new ArrayList<>();
		List<String> array2 = Arrays.asList("1","2");
		array1.add("A");
		array1.add("B");
		array1.add("C");
		array1.add("D");
		array1.add("E");
		array1.add("F");
		array1.addAll(3,array2);
		System.out.println(array1);
	}

}
