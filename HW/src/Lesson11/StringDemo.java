package Lesson11;

public class StringDemo {
	public static void method1(String string) {
		if (string.endsWith("!!!")) {
			System.out.println("������ ������������� ����� ���������������� �������");
		}
	}

	public static void method2(String string) {
		if (string.startsWith("I like")) {
			System.out.println("������ ���������� � ����� :��� ��������");
		}
	}

	public static void main(String[] args) {
		String string1 = "I like JAVA!!!";
		method1(string1);
		method2(string1);
		method3("JAVA");
	}

	public static void method3(String string) {
		if (string.contains("JAVA")) {
			System.out.println("����� ����� ���� � �����������");
		}
	}

}
