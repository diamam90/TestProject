import java.util.Scanner;

public class SumAB {

	public static void main(String[] args) {
		System.out.println("������� ��� ����� �����");
		System.out.println("������ �����:");
		Scanner scanner1 = new Scanner(System.in);

		if (scanner1.hasNextInt()) {
			int a = scanner1.nextInt();
			System.out.println("������ �����:");
			Scanner scanner2 = new Scanner(System.in);
			if (scanner2.hasNextInt()) {
				int b = scanner2.nextInt();
				sum(a, b);
			} else
				System.out.println("�� �����, ����� ������ ���� �����!!!");
		} else
			System.out.println("�� �����, ����� ������ ���� �����!!!");

	}

	private static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("����� ���� ����� ����� " + sum);
	}

}
