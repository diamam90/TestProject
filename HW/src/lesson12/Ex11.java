package lesson12;

import java.util.Arrays;
import java.util.regex.*;

public class Ex11 {
	public static void minDifferentChar(String str) {
		String[] strings = str.split(" ");
		System.out.println(Arrays.toString(strings));
		int[] count = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			char[] chs = strings[i].toCharArray();
			count[i] = 1;
			Arrays.sort(chs);
			for (int j =0; j<chs.length-1;j++) {
				if (chs[j]!=chs[j+1]) {count[i]=count[i]+1;}
			}
			
			
		//	System.out.println(count[i]);
		}
		int min=count[0];
		int pos=0;
		for (int i=0; i< strings.length;i++) {
			if (count[i]<min) {
				min=count[i];
				pos=i;
			}
		}
		System.out.println("Cлово (" + strings[pos]+ 
				") с минимальным количеством разных символов (" + min+ ")");
	}
	public static void countOfLatina(String str) {
		
		Pattern p= Pattern.compile("[a-zA-Z]\\W");
		Matcher m=p.matcher(str);
		int count=0;
		while (m.find()) {
			count++;
		}
		System.out.println("Количество слов, содержащих"
				+ " только латинские буквы - " + count);
	}
	public static void palindrome(String s) {
		Matcher m= Pattern.compile("\\w{2,}").matcher(s);
		
		while (m.find()) {
			System.out.println(m.group());
			StringBuilder str1 = new StringBuilder();
			StringBuilder str2 = new StringBuilder();
			str1.append(m.group());
			str2.append(m.group()).reverse();
			System.out.println(str1!=str2);
			}
//			
			
		}
		
	}
	public static void main(String[] args) {
//		String str = "fffffac ab fb 1234 jkjk";
//		minDifferentChar(str);
//		String s="One two three раз два три one1 two2 123 ";
//		countOfLatina(s);
		String s1="Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
		palindrome(s1);
	}
}