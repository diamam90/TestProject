import java.util.Scanner;

public class SumAB {

	public static void main(String[] args) {
		System.out.println("Введите два целых числа");
		System.out.println("Первое число:");
		Scanner scanner1 = new Scanner(System.in);

		if (scanner1.hasNextInt()) {
			int a = scanner1.nextInt();
			System.out.println("Второе число:");
			Scanner scanner2 = new Scanner(System.in);
			if (scanner2.hasNextInt()) {
				int b = scanner2.nextInt();
				sum(a, b);
			} else
				System.out.println("Ты пидор, числа должны быть целые!!!");
		} else
			System.out.println("Ты пидор, числа должны быть целые!!!");

	}

	private static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Сумма этих чисел равна " + sum);
	}

}
