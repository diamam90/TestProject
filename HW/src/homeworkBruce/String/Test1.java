package homeworkBruce.String;

import java.util.regex.*;

public class Test1 {

	public static void main(String[] args) {
		String s = "Here's  a block of text to use as input to\r\n"
				+ "the regular expression matcher. Note that we'll\r\n"
				+ "first extract the block of text by looking for\r\n"
				+ "the special delimiters, then process the\r\n"
				+ "extracted block.";
		System.out.println(s);
		s=s.replaceFirst("[aeiou]","(VOWEL1)");
		Pattern pattern = Pattern.compile("[aeiou]");
		Matcher m=pattern.matcher(s);	
		
		StringBuffer sbuf = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sbuf, m.group().toUpperCase());
		}
		System.out.println();
		System.out.println(sbuf);
		System.out.println();
		m.appendTail(sbuf);
		System.out.println(sbuf);
	}

}
