package lesson4;

public class IfElseIfDemo {

	public static void main(String[] args) {
		if ("1".equals(args[0])) {
			System.out.println("��� �����������");
		} else if ("2".equals(args[0])) {
			System.out.println("��� �������");
		} else if ("3".equals(args[0])) {
			System.out.println("��� �����");
		} else if ("4".equals(args[0])) {
			System.out.println("��� �������");
		} else if ("5".equals(args[0])) {
			System.out.println("��� �������");
		} else if ("6".equals(args[0]) || "7".equals(args[0])) {
			System.out.println("��� ��������");
		} else
			System.out.println("����� ������������ ��������");
	}

}
