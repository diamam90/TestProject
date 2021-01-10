/*package homeworkBruce.polymorphism;
import java.util.Arrays;
import homeworkBruce.polymorphism.music.interfaces.*;

public class ChangeSymbols extends Apply {
	public String name() {
		return getClass().getName();
	}
	public String process(Processor p,String s) {
			
	}	
	public static void main(String[] args) {
		Apply.process( new ChangeSymbols(), "afadfasdfasdadsfasdfadfasdf");
	}
	
}

char[] ch;
ch=s.toCharArray();
System.out.println(Arrays.toString(ch));
int n = ch.length;
if (n %2 != 0) {
	n = n-1;
}
if ((n/2) % 2!= 0) {n-=2;}
for (int i = 0; i< n; i+=4) {
	char c=ch[i];
	ch[i]=ch[i+2];
	ch[i+2]=c;
	c=ch[i+1];
	ch[i+1]=ch[i+3];
	ch[i+3]=c;
}
System.out.println(Arrays.toString(ch));
return ch.toString();*/