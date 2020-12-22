import java.util.Scanner;
/*public class SrendeeArifm {

	public static void main(String[] args) {
		System.out.println("Введите три вещественных числа");
		System.out.println("Первое число:");
		Scanner scan1 = new Scanner(System.in);
		if (scan1.hasNextDouble()) {
			double a=scan1.nextDouble();
			System.out.println("Второе число:");
			Scanner scan2 = new Scanner(System.in);
			if (scan2.hasNextDouble()) {
				double b=scan2.nextDouble();
				System.out.println("Третье число:");
				Scanner scan3 = new Scanner(System.in);
				if (scan3.hasNextDouble()) {
					double c=scan3.nextDouble();
					double SrAr=(a+b+c)/3;
					System.out.println("Среднее арифметическое этих чисел:" + SrAr);
				}
			}
			else System.out.println("Ты пидор, вводи вещественные числа!");
		}
		else System.out.println("Ты пидор, вводи вещественные числа!");
	}
}

*/
public class SrendeeArifm {

	public static void main(String[] args) {
		System.out.println("Введите три вещественных числа");
		System.out.println("Первое число:");
		Scanner scan1 = new Scanner(System.in);
		if (scan1.hasNextDouble()) {
			double a=scan1.nextDouble();
			System.out.println("Второе число:");
			Scanner scan2 = new Scanner(System.in);
			if (scan2.hasNextDouble()) {
				double b=scan2.nextDouble();
				System.out.println("Третье число:");
				Scanner scan3 = new Scanner(System.in);
				if (scan3.hasNextDouble()) {
					double c=scan3.nextDouble();
					double SrAr=(a+b+c)/3;
					System.out.println("Среднее арифметическое этих чисел:" + SrAr);
				}
			}
			else System.out.println("Ты пидор, вводи вещественные числа!");
		}
		else System.out.println("Ты пидор, вводи вещественные числа!");
	}
}