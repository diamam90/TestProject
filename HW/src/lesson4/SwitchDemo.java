package lesson4;

public class SwitchDemo {
	public static void main(String[] args) {
		switch (args[0]) {
			case "1" :
				System.out.println("��� �����������");
				break;
			case "2" :
				System.out.println("��� �������");
				break;
			case "3" :
				System.out.println("��� �����");
				break;
			case "4" :
				System.out.println("��� �������");
				break;
			case "5" :
				System.out.println("��� �������");
				break;
			case "6" :
			case "7" :
				System.out.println("��� ��������");
				break;
			default: 
				System.out.println("�� ����� ������������ ��������");
		}
	}
	

}
