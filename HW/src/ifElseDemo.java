import java.util.Scanner;

public class ifElseDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			compareNumber(number);
		} else {
			System.out.println("�� �����");
		}
	}

	private static void compareNumber(int number) {
		if (number > 0 && number < 10) {
			System.out.println(number + " " + "� ���� ����� � ���������� �� 0 �� 10");
		}
		// System.out.println(scanner.nextInt());
		else {
			System.out.println(number + " " + "� ���� ����� �� � ���������� �� 0 �� 10");
		}
	}
}
