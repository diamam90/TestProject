package homeworkBruce.polymorphism.music.interfaces;

import java.util.Arrays;

public class aaa implements Processor {
	public String name() {return "aaa";}
	public String process(Object input) {
		char[] ch;
		ch=((String)input).toCharArray();
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
	public static void main(String[] args) {
		Apply.process(new aaa(),"ÌÀÌÀ ÌÛËÀ ÐÀÌÓ");
	}
}
