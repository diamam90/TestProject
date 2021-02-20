package homeworkBruce.containers;
import homeworkBruce.containers.Stack;
public class Ex15 {

	public static void main(String[] args) {
		String s="+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		Stack<Character> chars = new Stack<>();
		char[] ch=s.toCharArray();
		for (int i=0;i<ch.length;i++) {
			if (ch[i]=='+'){ chars.push(ch[i+1]);
			System.out.println(chars);}
			if (ch[i]=='-') {chars.pop();}
		}
		System.out.println();
		System.out.println(chars);
	}

}
