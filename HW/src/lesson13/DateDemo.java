package lesson13;

import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(1990,9,8);
		LocalDate today= LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek()); 
		
		System.out.println(today.isAfter(ld));
		System.out.println(ld.isAfter(today));
		System.out.println(today.equals(ld));
		System.out.println(today.isLeapYear());
	}

}
