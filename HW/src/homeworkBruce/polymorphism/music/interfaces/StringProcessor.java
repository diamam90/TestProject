package homeworkBruce.polymorphism.music.interfaces;
import java.util.*;
public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s = "If she weighs the same as a duck, she's made of wood";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(),s);
		Apply.process(new DownCase(), s);
		Apply.process(new ChangeSymbol(),s);
	}

}
class Upcase extends StringProcessor{
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class DownCase extends StringProcessor{
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends StringProcessor{
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
class ChangeSymbol extends StringProcessor{
	public String process(Object input) {
		char[] ch;
		ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		int n = ch.length;
		if (n %2 != 0) {
			n = n-1;
		}
		for (int i = 0; i< n; i+=2) {
			char c=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=c;
		}	
		return Arrays.toString(ch);
		
	}
}