package lesson12;
import java.util.regex.*;
public class RegexDemo {
	public static void main(String[] args) {
		String regex ="Java\\s*\\d{1,2}";
		String text =" Version Java 6, Java  5, Java3, Java 12";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {System.out.println(matcher.group());}
		
	}
}
