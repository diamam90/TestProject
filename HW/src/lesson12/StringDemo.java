package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("Object-oriented programming is a programming "
				+ "language model organized\naround objects rather than \"actions\" and data rather than logic."
				+ " object-oriented programming blabla.\nObject-oriented programming bla. "
				+ "Object-oriented programming tralala. Object-oriented programming...");
		String stringPattern = "(O|o)bject-oriented programming";
		String newString = "OOP";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher m = pattern.matcher(text);
		StringBuilder sb= new StringBuilder();
		int i=1;
		while (m.find()) {
			if (i%2 ==0) {
				m.appendReplacement(sb, newString);
			}
			i++;
		}
		m.appendTail(sb);
		System.out.println(sb);
	}
		
	
}