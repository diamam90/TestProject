package lesson12;
import java.util.Formatter;
public class FormatterTest {

	public static void main(String[] args) {
	print("������", 4, "������");	
	print("�����", 4, "������");	
		
	}
	private static void print(String lastname,int mark, String subject) {
		
		System.out.printf("������� %-15S ������� ������ %-3s �� �������� %-10s", lastname, mark, subject);

	}
	
}
