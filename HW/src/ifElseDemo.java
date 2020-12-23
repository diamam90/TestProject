import java.util.Scanner;

public class ifElseDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			compareNumber(number);
		} else {
			System.out.println("Ты пидор");
		}
	}

	private static void compareNumber(int number) {
		if (number > 0 && number < 10) {
			System.out.println(number + " " + "у тебя число в промежутке от 0 до 10");
		}
		// System.out.println(scanner.nextInt());
		else {
			System.out.println(number + " " + "у тебя число не в промежутке от 0 до 10");
		}
	}
}
