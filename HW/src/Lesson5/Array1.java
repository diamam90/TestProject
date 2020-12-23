package Lesson5;

public class Array1 {

	public static void main(String[] args) {
		// String[] day = {"Monday","Tuesday", "Wednsday", "Thursday", "Friday",
		// "Saturday", "Sunday"};
		/*
		 * String[] day=new String[7]; day[0]="Monday"; day[1]="Tuesday";
		 * day[2]="Wednsday"; day[3]="Thursday"; day[4]="Friday"; day[5]="Saturday";
		 * day[6]="Sunday"; //System.out.println(day[6]); double[] array= {2.34, 3.45,
		 * 6.66, 6.78}; for (double element:array) { System.out.println(element); }
		 */
		print(new int[] { 3, 6, 8, 9 });
	}

	static void print(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
}
