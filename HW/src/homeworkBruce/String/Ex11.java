package homeworkBruce.String;
import java.util.regex.*;
public class Ex11 {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression " + 
				"characterSequence regularExpression+");
			System.exit(0);  
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for(String arg : args) {
			System.out.println("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			if(!m.find()) 
				System.out.println("No match found for " + "\"" + arg + "\"");
			m.reset();
			while(m.find()) {
				System.out.println("Match \"" + m.group() + "\" at position " +
					m.start() + ((m.end() - m.start() < 2) ? "" :  ("-" + (m.end() - 1))));
			}
		}
		System.out.println(args[0]);
	}
}
