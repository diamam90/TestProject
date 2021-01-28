package homeworkBruce.String;
import java.util.regex.*;
public class TestReg {

	public static void main(String[] args) {
		String text = "Arline ate eight apples and one orange while Anita hadn't any";
		String regex= "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			System.out.println(m.group());
		}
		

	}

}
