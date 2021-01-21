package lesson12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("object-oriented programming is a programming "
				+ "language model organized around objects rather than \"actions\" and data rather than logic."
				+ " object-oriented programming blabla. Object-oriented programming bla. object-oriented programming tralala. Object-oriented programming");
		String stringPattern = "(Object|object)\\-oriented programming";
		String newString = "OOP";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()){
			System.out.println(matcher.group());
		
		}
		System.out.println(text);
		}

}
