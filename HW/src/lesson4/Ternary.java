package lesson4;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� ����� 1:");
		a = tern(scan);
		System.out.println("������� ����� ����� 2:");
		b = tern(scan);
		System.out.println("������� ����� ����� 3:");
		c = tern(scan);
		if (a > b && a > c) {
			System.out.println("����� " + a + " ������� �� ������");
		} else if (b > a && b > c) {
			System.out.println("����� " + b + " ������� �� ������");
		} else {
			System.out.println("����� " + c + " ������� �� ������");
		}

		/*
		 * System.out.println("������� ����� ����� �2:"); b=scan.nextInt();
		 * System.out.println("������� ����� ����� �3:"); c=scan.nextInt(); k=a<0 ? -a :
		 * a;
		 */

	}

	static int tern(Scanner scan) {
		int a = 0;
		int mod = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		mod = a < 0 ? -a : a;
		return mod;
	}
}
