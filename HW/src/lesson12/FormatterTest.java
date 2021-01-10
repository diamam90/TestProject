package lesson12;
import java.util.Formatter;
public class FormatterTest {

	public static void main(String[] args) {
	print("ищенко", 4, "физика");	
	print("петро", 4, "физика");	
		
	}
	private static void print(String lastname,int mark, String subject) {
		
		System.out.printf("Студент %-15S получил оценку %-3s по предмету %-10s", lastname, mark, subject);

	}
	
}
